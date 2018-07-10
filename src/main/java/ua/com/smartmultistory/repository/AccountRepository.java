package ua.com.smartmultistory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.smartmultistory.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
