package ua.com.smartmultistory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.smartmultistory.model.Flat;
import ua.com.smartmultistory.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
