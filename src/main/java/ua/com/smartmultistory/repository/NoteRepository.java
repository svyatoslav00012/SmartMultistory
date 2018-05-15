package ua.com.smartmultistory.repository;

import ua.com.smartmultistory.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Role, Long> {
}
