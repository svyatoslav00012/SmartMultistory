package ua.com.smartmultistory.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.smartmultistory.model.AccountDetails;
import ua.com.smartmultistory.services.interfaces.AccountDetailsService;
import ua.com.smartmultistory.services.interfaces.AccountService;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService {

	@Autowired
    AccountService accountService;

	@Override
	public AccountDetails loadUserByUsername(String email) {
        return accountService.loadByEmail(email);
    }
}
