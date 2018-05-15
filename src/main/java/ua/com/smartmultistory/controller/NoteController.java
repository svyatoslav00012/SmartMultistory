package ua.com.smartmultistory.controller;

import ua.com.smartmultistory.exception.ResourceNotFoundException;
import ua.com.smartmultistory.model.Note;
import ua.com.smartmultistory.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {

	@Autowired
	NoteRepository noteRepository;

	@GetMapping("/note")
	public List<Note> getAllNotes() {
		return noteRepository.findAll();
	}

	@PostMapping("/note")
	public Note createNote(@Valid @RequestBody Note note) {
		return noteRepository.save(note);
	}

	@GetMapping("/note/{id}")
	public Note getNoteById(@PathVariable(value = "id") Long noteId) {
		return noteRepository.findById(noteId)
				.orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
	}

	@PutMapping("/note/{id}")
	public Note updateNote(@PathVariable(value = "id") Long noteId,
						   @Valid @RequestBody Note noteDetails) {

		Note note = noteRepository.findById(noteId)
				.orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

		note.setNam(noteDetails.);
		note.setPriority(noteDetails.getPriority());
		note.setUsers(noteDetails.getUsers());

		Note updatedNote = noteRepository.save(note);
		return updatedNote;
	}

	@DeleteMapping("/note/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long noteId) {
		Note Note = noteRepository.findById(noteId)
				.orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));

		noteRepository.delete(Note);

		return ResponseEntity.ok().build();
	}
}
