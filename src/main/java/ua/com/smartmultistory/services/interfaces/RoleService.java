package ua.com.smartmultistory.services.interfaces;

import ua.com.smartmultistory.model.Role;

import javax.validation.Valid;
import java.util.List;

public interface RoleService {

    List<Role> findAll();

    Role findById(Long roleId);

    Role create(Role newRole);

    Role update(Long roleId, @Valid Role roleDetails);

    void delete(Long roleId);
}
