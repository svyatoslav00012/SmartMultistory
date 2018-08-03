package ua.com.smartmultistory.services.interfaces;

import ua.com.smartmultistory.model.Note;
import ua.com.smartmultistory.model.NoteDTO;

import java.util.List;


public interface NoteService {

    List<Note> findAll();

    Note findById(Long noteId);

    Note create(NoteDTO noteFromClient);

    void delete(Long noteId);

    void deleteAll();

    List<Note> findAllForHouse(Long houseId);

    List<Note> findAllForCurrentHouse();
}
