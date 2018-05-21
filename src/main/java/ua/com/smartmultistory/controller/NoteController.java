package ua.com.smartmultistory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.Note;
import ua.com.smartmultistory.repository.NoteRepository;
import ua.com.smartmultistory.services.NotesService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {

	@Autowired
	private NoteRepository noteRepository;

	@Autowired
	private NotesService service;

	@GetMapping("/notes")
	public List<Note> getAllNotes() {
		return noteRepository.findAll();
	}

	@PostMapping("/note")
	public Note createNote(@Valid @RequestBody Note note) {
		return service.createNote(note);
	}

	@GetMapping("/note/{id}")
	public Note getNoteById(@PathVariable(value = "id") Long noteId) {
		return noteRepository.findById(noteId)
				.orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
	}
	@DeleteMapping("/note/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
		Note note = noteRepository.findById(noteId)
				.orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

		noteRepository.delete(note);

		return ResponseEntity.ok().build();
	}

//	@PutMapping("/note/{id}")
//	public Note updateNote(@PathVariable(value = "id") Long noteId,
//						   @Valid @RequestBody Note noteDetails) {
//
//		Note note = noteRepository.findById(noteId)
//				.orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
//
//		note.setNumber(noteDetails.getNumber());
//		note.setHouse(noteDetails.getHouse());
//		note.setUsers(noteDetails.getUsers());
//
//		Note updatedNote = noteRepository.save(note);
//		return updatedNote;
//	}


}
