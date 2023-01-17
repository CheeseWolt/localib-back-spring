package cheesewolt.localib.vehicule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("vehicules")
public class VehiculeControler {
    private VehiculeRepository repository;

    @Autowired
    public VehiculeControler(VehiculeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Vehicule> findAll() {
        return (List<Vehicule>) this.repository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Vehicule> findById(@PathVariable Integer id) {
        return this.repository.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Vehicule vehicule) {
        this.repository.save(vehicule);
    }

    @PutMapping
    public void update(@RequestBody Vehicule vehicule) {
        this.repository.save(vehicule);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        this.repository.deleteById(id);
    }

}
