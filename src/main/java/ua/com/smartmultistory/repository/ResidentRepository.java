package ua.com.smartmultistory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.smartmultistory.model.Resident;

@Repository
public interface ResidentRepository extends JpaRepository<Resident, Long> {
}
