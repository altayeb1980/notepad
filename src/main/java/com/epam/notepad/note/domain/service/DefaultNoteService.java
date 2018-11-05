package com.epam.notepad.note.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.notepad.note.domain.model.Note;
import com.epam.notepad.note.domain.repository.NoteRepository;

@Service
public class DefaultNoteService implements NoteService {
	
	@Autowired
	private NoteRepository noteRepository;

	public Note create(Note note) {
		return noteRepository.save(note);
	}

	public void delete(Note note) {
		noteRepository.delete(note);
		
	}

	public List<Note> findAll() {
		return noteRepository.findAll();
	}
}
