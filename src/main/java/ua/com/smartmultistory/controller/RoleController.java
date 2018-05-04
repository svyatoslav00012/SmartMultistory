package ua.com.smartmultistory.controller;

import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.Role;
import ua.com.smartmultistory.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {

	@Autowired
	RoleRepository roleRepository;

	@GetMapping("/roles")
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}

	@PostMapping("/roles")
	public Role createRole(@Valid @RequestBody Role role) {
		return roleRepository.save(role);
	}

	@GetMapping("/roles/{id}")
	public Role getRoleById(@PathVariable(value = "id") Long roleId) {
		return roleRepository.findById(roleId)
				.orElseThrow(() -> new ResourceNotFoundException("Role", "id", roleId));
	}

	@PutMapping("/roles/{id}")
	public Role updateRole(@PathVariable(value = "id") Long roleId,
						   @Valid @RequestBody Role roleDetails) {

		Role role = roleRepository.findById(roleId)
				.orElseThrow(() -> new ResourceNotFoundException("Role", "id", roleId));

		role.setName(roleDetails.getName());
		role.setPriority(roleDetails.getPriority());

		Role updatedRole = roleRepository.save(role);
		return updatedRole;
	}

	@DeleteMapping("/roles/{id}")
	public ResponseEntity<?> deleteRole(@PathVariable(value = "id") Long roleId) {
		Role Role = roleRepository.findById(roleId)
				.orElseThrow(() -> new ResourceNotFoundException("Role", "id", roleId));

		roleRepository.delete(Role);

		return ResponseEntity.ok().build();
	}
}
