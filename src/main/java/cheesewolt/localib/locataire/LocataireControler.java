package cheesewolt.localib.locataire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("locataires")
public class LocataireControler {
    private LocataireRepository repository;

    @Autowired
    public LocataireControler(LocataireRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Locataire> findAll() {
        return (List<Locataire>) this.repository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Locataire> findById(@PathVariable Integer id) {
        return this.repository.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Locataire locataire) {
        this.repository.save(locataire);
    }

    @PutMapping
    public void update(@RequestBody Locataire locataire) {
        this.repository.save(locataire);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        this.repository.deleteById(id);
    }

}
