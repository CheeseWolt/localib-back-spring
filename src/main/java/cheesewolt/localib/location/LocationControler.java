package cheesewolt.localib.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("locations")
public class LocationControler {
    private LocationRepository repository;

    @Autowired
    public LocationControler(LocationRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Location> findAll() {
        return (List<Location>) this.repository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Location> findById(@PathVariable Integer id) {
        return this.repository.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Location locations) {
        this.repository.save(locations);
    }

    @PutMapping
    public void update(@RequestBody Location locations) {
        this.repository.save(locations);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        this.repository.deleteById(id);
    }

}
