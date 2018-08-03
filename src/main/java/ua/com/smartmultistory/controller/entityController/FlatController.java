package ua.com.smartmultistory.controller.entityController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.smartmultistory.model.Flat;
import ua.com.smartmultistory.services.interfaces.FlatService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FlatController {

	@Autowired
    FlatService flatService;

    @GetMapping("/flats")
    public List<Flat> getAllFlats() {
        return flatService.findAll();
    }

	@PostMapping("/flat")
	public Flat createFlat(@Valid @RequestBody Flat flat) {
        return flatService.create(flat);
    }

	@GetMapping("/flat/{id}")
	public Flat getFlatById(@PathVariable(value = "id") Long flatId) {
        return flatService.findById(flatId);
    }

	@PutMapping("/flat/{id}")
	public Flat updateFlat(@PathVariable(value = "id") Long flatId,
						   @Valid @RequestBody Flat flatDetails) {
        return flatService.update(flatId, flatDetails);
    }

	@DeleteMapping("/flat/{id}")
	public ResponseEntity<?> deleteFlat(@PathVariable(value = "id") Long flatId) {
        flatService.delete(flatId);
        return ResponseEntity.ok().build();
    }
}
