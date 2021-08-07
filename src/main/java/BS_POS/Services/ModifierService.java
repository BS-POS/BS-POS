package BS_POS.Services;

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
}
