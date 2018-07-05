package ua.com.smartmultistory.controller;

import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.Flat;
import ua.com.smartmultistory.repository.FlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FlatController {

	@Autowired
	FlatRepository flatRepository;

	@GetMapping("/flat")
	public List<Flat> getAllFlats() {
		return flatRepository.findAll();
	}

	@PostMapping("/flat")
	public Flat createFlat(@Valid @RequestBody Flat flat) {
		return flatRepository.save(flat);
	}

	@GetMapping("/flat/{id}")
	public Flat getFlatById(@PathVariable(value = "id") Long flatId) {
		return flatRepository.findById(flatId)
				.orElseThrow(() -> new ResourceNotFoundException("Flat", "id", flatId));
	}

	@PutMapping("/flat/{id}")
	public Flat updateFlat(@PathVariable(value = "id") Long flatId,
						   @Valid @RequestBody Flat flatDetails) {

		Flat flat = flatRepository.findById(flatId)
				.orElseThrow(() -> new ResourceNotFoundException("Flat", "id", flatId));

		flat.setNumber(flatDetails.getNumber());
		flat.setHouse(flatDetails.getHouse());
		flat.setUsers(flatDetails.getUsers());

		Flat updatedFlat = flatRepository.save(flat);
		return updatedFlat;
	}

	@DeleteMapping("/flat/{id}")
	public ResponseEntity<?> deleteFlat(@PathVariable(value = "id") Long flatId) {
		Flat flat = flatRepository.findById(flatId)
				.orElseThrow(() -> new ResourceNotFoundException("Flat", "id", flatId));

		flatRepository.delete(flat);

		return ResponseEntity.ok().build();
	}
}
