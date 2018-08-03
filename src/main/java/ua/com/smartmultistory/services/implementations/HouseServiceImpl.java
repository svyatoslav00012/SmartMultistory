package ua.com.smartmultistory.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.House;
import ua.com.smartmultistory.repository.HouseRepository;
import ua.com.smartmultistory.services.interfaces.HouseService;

import javax.validation.Valid;
import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseRepository repository;

    @Override
    public List<House> findAll() {
        return repository.findAll();
    }

    @Override
    public House findById(Long houseId) {
        return repository.findById(houseId)
                .orElseThrow(() -> new ResourceNotFoundException("House", "id", houseId));
    }

    @Override
    public House create(House newHouse) {
        return repository.save(newHouse);
    }

    @Override
    public House update(Long houseId, @Valid House houseDetails) {
        House houseToUpdate = findById(houseId);
        houseToUpdate.updateFromDetails(houseDetails);
        House updatedHouse = repository.save(houseToUpdate);
        return updatedHouse;
    }

    @Override
    public void delete(Long houseId) {
        repository.deleteById(houseId);
    }
}
