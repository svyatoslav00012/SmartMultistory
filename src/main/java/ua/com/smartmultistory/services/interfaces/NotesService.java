package ua.com.smartmultistory.services.interfaces;

import org.springframework.stereotype.Service;
import ua.com.smartmultistory.model.Note;

@Service
public interface NotesService {

	public Note createNote(Note note);

}
