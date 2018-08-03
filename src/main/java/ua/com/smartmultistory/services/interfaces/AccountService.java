package ua.com.smartmultistory.services.interfaces;

import ua.com.smartmultistory.model.Account;
import ua.com.smartmultistory.model.AccountChangePasswordDTO;

import java.util.List;


public interface AccountService {

	List<Account> getAll();

	Account loadByEmail(String email);

	Account loadById(Long id);

	Account create(Account account);

	Account update(Long id, Account accountDetails);

	Account updatePassword(Long id, AccountChangePasswordDTO passwords);
}
