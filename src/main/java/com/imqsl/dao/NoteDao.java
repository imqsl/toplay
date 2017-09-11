package com.imqsl.dao;

import com.imqsl.dao.provider.NoteDynaSqlProvider;
import com.imqsl.domain.Note;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static com.imqsl.util.common.ToPlayConstants.NOTETABLE;

/**
 * Created by imqsl on 2017/9/8.
 */
public interface NoteDao {
    //动态插入公告
    @SelectProvider(type = NoteDynaSqlProvider.class, method = "insertWithParams")
    void dynaInsertNote(Note note);

    //根据id查询公告
    @Select("select * from " + NOTETABLE + " where id=#{id}")
    Note selectById(Integer id);

    //根据id删除公告
    @Delete("delete from " + NOTETABLE + " where id=#{id}")
    void deleteNote(Integer id);

    //动态查询
    @SelectProvider(type = NoteDynaSqlProvider.class, method = "selectWithParams")
    List<Note> selectWithParams(Note note);

    //更新公告
    @SelectProvider(type = NoteDynaSqlProvider.class, method = "updateWithParams")
    void dynaUpdate(Note note);
}
