package com.imqsl.service;

import com.imqsl.domain.Note;

import java.util.List;

/**
 * Created by imqsl on 2017/9/13.
 */
public interface NoteService {
    //添加公告
    void addNote(Note note);

    //根据id删除公告
    void removeNote(Integer id);

    //修改公告
    void modifyNote(Note note);

    //根据id查询公告
    Note findNoteById(Integer id);

    //获得所有公告
    List<Note> findNote(Note note);
}
