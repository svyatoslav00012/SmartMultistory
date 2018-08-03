package ua.com.smartmultistory.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.Account;
import ua.com.smartmultistory.model.House;
import ua.com.smartmultistory.model.Note;
import ua.com.smartmultistory.model.NoteDTO;
import ua.com.smartmultistory.repository.NoteRepository;
import ua.com.smartmultistory.services.interfaces.HouseService;
import ua.com.smartmultistory.services.interfaces.NoteService;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;
    @Autowired
    private HouseService houseService;

    @Override
    public Note create(NoteDTO noteFromClient) {
        Note newNote = new Note(noteFromClient);
        Note savedNote = noteRepository.save(newNote);
        return savedNote;
    }

    @Override
    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    @Override
    public List<Note> findAllForHouse(Long houseId) {
        House house = houseService.findById(houseId);
        return house.getNotes();
    }

    private List<Note> findAllForHouse(House house) {
        List<Note> allHouseNotes = new ArrayList<Note>();
        for (Account account : house.getAccounts())
            allHouseNotes.addAll(account.getNotes());
        return allHouseNotes;
    }

    @Override
    public List<Note> findAllForCurrentHouse() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication curAuthentication = context.getAuthentication();
        Account currentAccount = (Account) curAuthentication.getPrincipal();
        House currentHouse = currentAccount.getHouse();
        return currentHouse.getNotes();
    }


    @Override
    public Note findById(Long noteId) {
        return noteRepository.findById(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "noteId", noteId));
    }

    @Override
    public void delete(Long noteId) {
        noteRepository.deleteById(noteId);
    }

    @Override
    public void deleteAll() {
        noteRepository.deleteAll();
    }
}
