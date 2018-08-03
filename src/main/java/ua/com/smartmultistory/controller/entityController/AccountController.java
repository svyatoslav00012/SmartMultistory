package ua.com.smartmultistory.controller.entityController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.smartmultistory.model.Account;
import ua.com.smartmultistory.model.AccountChangePasswordDTO;
import ua.com.smartmultistory.services.interfaces.AccountService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {


	@Autowired
    private AccountService service;

	@GetMapping("/accounts")
	public List<Account> getAllAccounts() {
		return service.getAll();
	}

	@GetMapping("/account/{id}")
	public Account loadById(@PathVariable(value = "id") Long id) {
		return service.loadById(id);
	}

	@PostMapping("/account")
	public Account addAccount(@Valid @RequestBody Account account) {
        return service.create(account);
    }

	@PutMapping("/account/{id}")
	public Account update(@PathVariable(value = "id") Long id, Account accountDetails) {
		return service.update(id, accountDetails);
	}

	@PutMapping("/account/updatePassword/{id}")
    public Account updatePassword(@PathVariable(value = "id") Long id, AccountChangePasswordDTO passwords) {
        return service.updatePassword(id, passwords);
    }

}