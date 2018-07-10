package ua.com.smartmultistory.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.AccountDetails;
import ua.com.smartmultistory.services.interfaces.AccountDetailsService;
import ua.com.smartmultistory.services.interfaces.AccountsService;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService {

	@Autowired
	AccountsService accountsService;

	@Override
	public AccountDetails loadUserByUsername(String email) {
		return accountsService.loadByEmail(email).orElseThrow(
				() -> new ResourceNotFoundException("Account", "email", email)
		);
	}
}
