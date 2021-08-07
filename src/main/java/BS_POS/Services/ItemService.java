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

    public Iterable<Item> indexItems(){
        return itemRepository.findAll();
    }

    public Item showItem(Long id){
        return itemRepository.findById(id).get();
    }
    public Item createItem(Item newItem) {
        return itemRepository.save(newItem);
    }

    public Boolean deleteItem (Item item) {
        itemRepository.delete(item);
        return true;
    }

}
