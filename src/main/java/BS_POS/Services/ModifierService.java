package BS_POS.Services;

import BS_POS.Model.Modifier;
import BS_POS.Repositories.ModifierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModifierService {

    private final ModifierRepository modifierRepository;

    @Autowired
    public ModifierService(ModifierRepository modifierRepository) {
        this.modifierRepository = modifierRepository;
    }

    public Iterable<Modifier> IndexAllModifiers() {
        return modifierRepository.findAll();
    }

    public Modifier showModifier(Long id) {
        return modifierRepository.findById(id).get();
    }

    public Modifier createModifier(Modifier newModifier) {
        return modifierRepository.save(newModifier);
    }

    public Boolean deleteModifier(Modifier modifier) {
        modifierRepository.delete(modifier);
        return true;
    }
}
