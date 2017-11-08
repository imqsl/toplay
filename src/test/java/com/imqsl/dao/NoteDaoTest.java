package com.imqsl.dao;

import com.imqsl.domain.Note;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-10-31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class NoteDaoTest {
    @Autowired
    NoteDao noteDao;
    @Test
    public void dynaInsertNote() throws Exception {
        Note note=new Note("通知1","您有一个好通知","2");
        noteDao.insert(note);
    }

    @Test
    public void selectById() throws Exception {
        Note note=noteDao.selectById(3);
        System.out.println(note);
    }

    @Test
    public void deleteNote() throws Exception {
        noteDao.deleteById(3);
    }

    @Test
    public void selectWithParams() throws Exception {
        Note note=new Note();
        List<Note> noteList=noteDao.selectWithParams(note);
        for (Note note1:noteList) {
            System.out.println(note1);
        }
    }

    @Test
    public void dynaUpdate() throws Exception {
        Note note=noteDao.selectById(3);
        note.setType("9");
        noteDao.update(note);
    }

}