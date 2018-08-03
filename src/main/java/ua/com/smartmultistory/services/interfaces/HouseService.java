package ua.com.smartmultistory.services.interfaces;

import ua.com.smartmultistory.model.House;

import javax.validation.Valid;
import java.util.List;

public interface HouseService {

    List<House> findAll();

    House findById(Long houseId);

    House create(House newHouse);

    House update(Long houseId, @Valid House houseDetails);

    void delete(Long houseId);
}
