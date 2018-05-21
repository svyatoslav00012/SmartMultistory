package ua.com.smartmultistory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.smartmultistory.model.Note;
import ua.com.smartmultistory.repository.NoteRepository;

@Service
public class NotesService {

    @Autowired
    private NoteRepository noteRepository;

    public Note createNote(Note note) {

        return noteRepository.save(note);
    }
}
