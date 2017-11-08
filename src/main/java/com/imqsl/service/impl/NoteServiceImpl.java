package com.imqsl.service.impl;

import com.imqsl.dao.NoteDao;
import com.imqsl.domain.Note;
import com.imqsl.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imqsl on 2017/9/14.
 */
@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    NoteDao noteDao;

    public void addNote(Note note) {
        noteDao.insert(note);
    }

    public void removeNote(Integer id) {
        noteDao.deleteById(id);
    }

    public void modifyNote(Note note) {
        noteDao.update(note);
    }

    public Note findNoteById(Integer id) {
        return noteDao.selectById(id);
    }

    public List<Note> findNote(Note note) {
        return noteDao.selectWithParams(note);
    }
}
