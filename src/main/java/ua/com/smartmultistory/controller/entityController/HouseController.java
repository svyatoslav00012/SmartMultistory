package ua.com.smartmultistory.controller.entityController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.smartmultistory.model.House;
import ua.com.smartmultistory.services.interfaces.HouseService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HouseController {

	@Autowired
    HouseService houseService;

    @GetMapping("/houses")
    public List<House> getAllHouses() {
        return houseService.findAll();
    }

	@PostMapping("/house")
	public House createHouse(@Valid @RequestBody House house) {
        return houseService.create(house);
    }

	@GetMapping("/house/{id}")
	public House getHouseById(@PathVariable(value = "id") Long houseId) {
        return houseService.findById(houseId);
    }

	@PutMapping("/house/{id}")
	public House updateHouse(@PathVariable(value = "id") Long houseId,
							 @Valid @RequestBody House houseDetails) {
        return houseService.update(houseId, houseDetails);
    }

	@DeleteMapping("/house/{id}")
	public ResponseEntity<?> deleteHouse(@PathVariable(value = "id") Long houseId) {
        houseService.delete(houseId);
        return ResponseEntity.ok().build();
    }
}
