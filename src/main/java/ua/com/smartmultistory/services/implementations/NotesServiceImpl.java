package ua.com.smartmultistory.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.smartmultistory.model.Note;
import ua.com.smartmultistory.repository.NoteRepository;

@Service
public class NotesServiceImpl {

    @Autowired
    private NoteRepository noteRepository;

    public Note createNote(Note note) {
        System.out.println("CREATE");
        return noteRepository.save(note);
    }
}
