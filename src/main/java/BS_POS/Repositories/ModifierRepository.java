package BS_POS.Repositories;

import BS_POS.Model.Modifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModifierRepository extends CrudRepository <Modifier, Long> {
}
