package BS_POS.Controllers;

import BS_POS.Model.CustomerCheck;
import BS_POS.Model.Item;
import BS_POS.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class ItemController {

    private  final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<Item> create(Item item){
        return new ResponseEntity<Item>(itemService.createItem(item), HttpStatus.CREATED);
    }

    @DeleteMapping
    public Boolean delete(Item item){
        return itemService.deleteItem(item);
    }


    //Still need to create updateItem in the itemService class.
//    @PutMapping
//    public Item update(@PathVariable Long id, Item item){
//        return itemService.updateItem(id, item);
//    }
}
