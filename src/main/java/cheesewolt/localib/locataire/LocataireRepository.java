package cheesewolt.localib.locataire;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocataireRepository extends CrudRepository<Locataire, Integer> {
}
