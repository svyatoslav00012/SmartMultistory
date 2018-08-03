package ua.com.smartmultistory.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.Role;
import ua.com.smartmultistory.repository.RoleRepository;
import ua.com.smartmultistory.services.interfaces.RoleService;

import javax.validation.Valid;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository repository;

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }

    @Override
    public Role findById(Long roleId) {
        return repository.findById(roleId)
                .orElseThrow(() -> new ResourceNotFoundException("Role", "id", roleId));
    }

    @Override
    public Role create(Role newRole) {
        return repository.save(newRole);
    }

    @Override
    public Role update(Long roleId, @Valid Role roleDetails) {
        Role roleToUpdate = findById(roleId);
        roleToUpdate.updateFromDetails(roleDetails);
        Role updatedRole = repository.save(roleToUpdate);
        return updatedRole;
    }

    @Override
    public void delete(Long roleId) {
        repository.deleteById(roleId);
    }
}
