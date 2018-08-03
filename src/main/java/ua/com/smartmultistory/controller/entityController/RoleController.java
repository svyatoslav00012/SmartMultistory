package ua.com.smartmultistory.controller.entityController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.smartmultistory.enumeration.RoleName;
import ua.com.smartmultistory.model.Role;
import ua.com.smartmultistory.services.interfaces.RoleService;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {

	@Autowired
    RoleService roleService;

	@GetMapping("/roles")
	public List<Role> getAllRoles() {
        return roleService.findAll();
    }

	@GetMapping("/roles/val")
	public List<RoleName> getRoleValues() {
		return Arrays.asList(RoleName.values());
	}

	@PostMapping("/role")
	public Role createRole(@Valid @RequestBody Role role) {
        return roleService.create(role);
    }

	@GetMapping("/role/{id}")
	public Role getRoleById(@PathVariable(value = "id") Long roleId) {
        return roleService.findById(roleId);
    }

	@PutMapping("/role/{id}")
	public Role updateRole(@PathVariable(value = "id") Long roleId,
						   @Valid @RequestBody Role roleDetails) {
        return roleService.update(roleId, roleDetails);
    }

	@DeleteMapping("/role/{id}")
	public ResponseEntity<?> deleteRole(@PathVariable(value = "id") Long roleId) {
        roleService.delete(roleId);
        return ResponseEntity.ok().build();
    }
}
