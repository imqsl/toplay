package com.imqsl.dao;

import com.imqsl.dao.provider.NoteDynaSqlProvider;
import com.imqsl.domain.Note;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017/9/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class NoteDaoTest {
    @Autowired
    NoteDao noteDao;

    @Test
    public void dynaInsertNote() throws Exception {
        Note note = new Note();
        note.setTitle("推荐0");
        note.setContent("00000000000");
        note.setType("1");
        noteDao.dynaInsertNote(note);
    }

    @Test
    public void deleteNote() throws Exception {
        noteDao.deleteNote(10);
    }

    @Test
    public void selectWithParams() throws Exception {
        Note note = new Note();
        note.setTitle("推荐");
        List<Note> noteList = noteDao.selectWithParams(note);
        for (Note note1 : noteList) {
            System.out.println(note1.toString());
        }

    }
    @Test
    public void updateWithParams(){
        Note note=new Note();
        note.setId(4);
        note.setTitle("活动");
        noteDao.dynaUpdate(note);
    }


}