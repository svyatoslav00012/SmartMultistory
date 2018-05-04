package ua.com.smartmultistory.controller;

import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.House;
import ua.com.smartmultistory.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HouseController {

	@Autowired
	HouseRepository houseRepository;

	@GetMapping("/houses")
	public List<House> getAllHouses() {
		return houseRepository.findAll();
	}

	@PostMapping("/houses")
	public House createHouse(@Valid @RequestBody House house) {
		return houseRepository.save(house);
	}

	@GetMapping("/houses/{id}")
	public House getHouseById(@PathVariable(value = "id") Long houseId) {
		return houseRepository.findById(houseId)
				.orElseThrow(() -> new ResourceNotFoundException("House", "id", houseId));
	}

	@PutMapping("/houses/{id}")
	public House updateHouse(@PathVariable(value = "id") Long houseId,
							 @Valid @RequestBody House houseDetails) {

		House house = houseRepository.findById(houseId)
				.orElseThrow(() -> new ResourceNotFoundException("House", "id", houseId));

		house.setAdress(houseDetails.getAdress());

		House updatedHouse = houseRepository.save(house);
		return updatedHouse;
	}

	@DeleteMapping("/houses/{id}")
	public ResponseEntity<?> deleteHouse(@PathVariable(value = "id") Long houseId) {
		House house = houseRepository.findById(houseId)
				.orElseThrow(() -> new ResourceNotFoundException("House", "id", houseId));

		houseRepository.delete(house);

		return ResponseEntity.ok().build();
	}
}
