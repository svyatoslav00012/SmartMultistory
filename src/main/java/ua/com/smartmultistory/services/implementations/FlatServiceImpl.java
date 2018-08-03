package ua.com.smartmultistory.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.Flat;
import ua.com.smartmultistory.repository.FlatRepository;
import ua.com.smartmultistory.services.interfaces.FlatService;

import javax.validation.Valid;
import java.util.List;

@Service
public class FlatServiceImpl implements FlatService {

    @Autowired
    private FlatRepository repository;

    @Override
    public List<Flat> findAll() {
        return repository.findAll();
    }

    @Override
    public Flat findById(Long flatId) {
        return repository.findById(flatId)
                .orElseThrow(() -> new ResourceNotFoundException("Flat", "id", flatId));
    }

    @Override
    public Flat create(Flat newFlat) {
        return repository.save(newFlat);
    }

    @Override
    public Flat update(Long flatId, @Valid Flat flatDetails) {
        Flat flatToUpdate = findById(flatId);
        flatToUpdate.updateFromDetails(flatDetails);
        Flat updatedFlat = repository.save(flatToUpdate);
        return updatedFlat;
    }

    @Override
    public void delete(Long flatId) {
        repository.deleteById(flatId);
    }
}
