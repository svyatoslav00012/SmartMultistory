package ua.com.smartmultistory.controller.entityController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.smartmultistory.model.Note;
import ua.com.smartmultistory.model.NoteDTO;
import ua.com.smartmultistory.services.interfaces.NoteService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {

	@Autowired
	private NoteService noteService;

	@GetMapping("/notes")
	public List<Note> getAllNotes() {
		return noteService.findAll();
	}

	@GetMapping("/notes/{houseId}")
	public List<Note> getAllNotesForHouse(@PathVariable("houseId") Long houseId) {
		return noteService.findAllForHouse(houseId);
	}

	@GetMapping("/notes/house")
	public List<Note> getAllNotesForCurrentHouse() {
		return noteService.findAllForCurrentHouse();
	}

	@PostMapping("/note")
	public Note createNote(@Valid @RequestBody NoteDTO note) {
		return noteService.create(note);
	}

	@GetMapping("/note/{id}")
	public Note getNoteById(@PathVariable(value = "id") Long noteId) {
		return noteService.findById(noteId);
	}
	@DeleteMapping("/note/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
		noteService.delete(noteId);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/notes/clear")
	public ResponseEntity<?> deleteNotes() {
		noteService.deleteAll();
		return ResponseEntity.ok().build();
	}
}
