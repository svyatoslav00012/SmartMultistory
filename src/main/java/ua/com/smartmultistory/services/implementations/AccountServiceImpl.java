package ua.com.smartmultistory.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.Account;
import ua.com.smartmultistory.model.AccountChangePasswordDTO;
import ua.com.smartmultistory.repository.AccountRepository;
import ua.com.smartmultistory.services.interfaces.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repository;

	@Autowired
	private PasswordEncoder encoder;

	@Override
    public Account loadByEmail(String email) {
        List<Account> allAccounts = repository.findAll();

		for (Account a : allAccounts)
            if (a.getEmail().equals(email))
                return a;

        return null;
    }

	@Override
	public Account loadById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Account", "id", id));
	}

	@Override
    public Account create(Account account) {
        account.setPassword(encoder.encode(account.getPassword()));
        Account updated = repository.save(account);
        return updated;
    }

	@Override
	public Account update(Long id, Account accountDetails) {
        Account account = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Account", "id", id));

        account.updateFromDetails(accountDetails);
        Account updatedAccount = repository.save(account);

        return updatedAccount;
    }

	@Override
	public List<Account> getAll() {
		return repository.findAll();
	}

	@Override
    public Account updatePassword(Long id, AccountChangePasswordDTO passwords) {
        Account account = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Account", "id", id));

		if (encoder.matches(passwords.getOldPassword(), account.getPassword())) {
            String newEncodedPassword = encoder.encode(passwords.getNewPassword());
            account.setPassword(newEncodedPassword);
            Account accountWithUpdatedPassword = repository.save(account);
            return accountWithUpdatedPassword;
        }
        return null;
    }

}
