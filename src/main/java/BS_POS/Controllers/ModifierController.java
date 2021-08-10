package BS_POS.Controllers;

import BS_POS.Services.ModifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ModifierController {

    private final ModifierService modifierService;

    @Autowired
    public ModifierController(ModifierService modifierService) {
        this.modifierService = modifierService;
    }


}
