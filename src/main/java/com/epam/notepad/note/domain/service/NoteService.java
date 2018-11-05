package com.epam.notepad.note.domain.service;

import java.util.List;

import com.epam.notepad.note.domain.model.Note;

public interface NoteService {
	Note create(Note note);
	void delete(Note note);
	List<Note> findAll();
}
