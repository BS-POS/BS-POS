package BS_POS.Controllers;

import BS_POS.Model.Modifier;
import BS_POS.Services.ModifierService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class ModifierController {

    private final ModifierService modifierService;

    @Autowired
    public ModifierController(ModifierService modifierService) {
        this.modifierService = modifierService;
    }

    @PostMapping
    public ResponseEntity<Modifier> create(Modifier modifier){
        return new ResponseEntity<Modifier>(modifierService.createModifier(modifier), HttpStatus.CREATED);
    }

    @DeleteMapping
    public Boolean delete(Modifier modifier){
        return modifierService.deleteModifier(modifier);
    }


    //Still need updateModifier method in the modifierService class.
//    @PostMapping
//    public Modifier update(@PathVariable Long id, Modifier modifier){
//        return modifierService.updateModifier(id, modifier);
//    }
}
