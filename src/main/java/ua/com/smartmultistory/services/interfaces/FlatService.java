package ua.com.smartmultistory.services.interfaces;

import ua.com.smartmultistory.model.Flat;

import javax.validation.Valid;
import java.util.List;

public interface FlatService {

    List<Flat> findAll();

    Flat findById(Long flatId);

    Flat create(Flat newFlat);

    Flat update(Long flatId, @Valid Flat flatDetails);

    void delete(Long flatId);
}
