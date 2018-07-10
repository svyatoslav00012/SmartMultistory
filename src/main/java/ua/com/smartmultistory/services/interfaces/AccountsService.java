package ua.com.smartmultistory.services.interfaces;

import ua.com.smartmultistory.model.Account;
import ua.com.smartmultistory.model.AccountChangePasswordForm;

import java.util.List;
import java.util.Optional;


public interface AccountsService {

	Optional<Account> loadByEmail(String email);

	Account loadById(Long id);

	Account save(Account account);

	Account update(Long id, Account accountDetails);

	List<Account> getAll();

	Optional<Account> updatePassword(Long id, AccountChangePasswordForm passwords);
}
