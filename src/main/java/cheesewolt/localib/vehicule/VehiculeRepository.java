package cheesewolt.localib.vehicule;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Integer> {
}