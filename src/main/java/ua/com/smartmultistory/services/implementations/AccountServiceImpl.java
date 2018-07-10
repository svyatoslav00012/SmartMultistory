package ua.com.smartmultistory.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.Account;
import ua.com.smartmultistory.model.AccountChangePasswordForm;
import ua.com.smartmultistory.repository.AccountRepository;
import ua.com.smartmultistory.services.interfaces.AccountsService;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountsService {

	@Autowired
	private AccountRepository repository;

	@Autowired
	private PasswordEncoder encoder;

	@Override
	public Optional<Account> loadByEmail(String email) {
		List<Account> allAccounts = repository.findAll();

		for (Account a : allAccounts)
			if (a.getUsername().equals(email))
				return Optional.ofNullable(a);
		return Optional.empty();
	}

	@Override
	public Account loadById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Account", "id", id));
	}

	@Override
	public Account save(Account account) {
		account.setPassword(encoder.encode(account.getPassword()));
		return repository.save(account);
	}

	@Override
	public Account update(Long id, Account accountDetails) {
		accountDetails.setId(id);
		return repository.save(accountDetails);
	}

	@Override
	public List<Account> getAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Account> updatePassword(Long id, AccountChangePasswordForm passwords) {
		Account account = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Account", "id", id));
		if (encoder.matches(passwords.getOldPassword(), account.getPassword())) {
			account.setPassword(encoder.encode(passwords.getNewPassword()));
			return Optional.ofNullable(repository.save(account));
		}
		return Optional.empty();
	}

}
