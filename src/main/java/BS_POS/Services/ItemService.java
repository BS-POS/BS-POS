package BS_POS.Services;

import BS_POS.Model.Item;
import BS_POS.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Iterable<Item> indexItems() {
        return itemRepository.findAll();
    }

    public Item showItem(Long id) {
        return itemRepository.findById(id).get();
    }
    public Item createItem(Item newItem) {
        return itemRepository.save(newItem);
    }

    public Boolean deleteItem (Item item) {
        itemRepository.delete(item);
        return true;
    }

    //This method need to access the modifiers and get the total sum of
    // the modifier costs.
    public Double calculateModifierTotal( Item item){
        Double modifiersPriceSum = 0.0;
        return modifiersPriceSum;
    }

    //May need a method to grab the total cost of a single item to be summed
    // and added to the check father in the program.

}
