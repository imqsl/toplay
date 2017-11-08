package com.imqsl.dao.provider;


import com.imqsl.domain.Note;
import org.apache.ibatis.jdbc.SQL;

import static com.imqsl.util.common.ToPlayConstants.NOTETABLE;


/**
 * Created by imqsl on 2017/9/11.
 */
public class NoteDynaSqlProvider {
    //动态查询
    public String selectWithParams(final Note note) {
        return new SQL() {
            {
                SELECT("*");
                FROM(NOTETABLE);
                if (note.getContent() != null && !note.getContent().equals("")) {
                    WHERE(" content LIKE CONCAT ('%',#{content},'%')");
                }
                if (note.getTitle() != null && !note.getTitle().equals("")) {
                    WHERE(" title LIKE CONCAT ('%',#{title},'%')");
                }
                if (note.getType() != null && !note.getType().equals("")) {
                    WHERE(" type LIKE CONCAT ('%',#{type},'%')");
                }
            }

        }.toString();
    }

    //动态插入
    public String insertWithParams(final Note note) {
        return new SQL() {
            {
                INSERT_INTO(NOTETABLE);
                if (note.getType() != null) {
                    VALUES("type", "#{type}");
                }
                if (note.getTitle() != null) {
                    VALUES("title", "#{title}");
                }
                if (note.getContent() != null) {
                    VALUES("content", "#{content}");
                }
            }
        }.toString();
    }

    //动态更新
    public String updateWithParams(final Note note) {
        return new SQL() {
            {
                UPDATE(NOTETABLE);
                if (note.getType() != null && !note.getType().equals("")) {
                    SET("type=#{type}");
                }
                if (note.getContent() != null && !note.getContent().equals("")) {
                    SET("content=#{content}");
                }
                if (note.getTitle() != null && !note.getTitle().equals("")) {
                    SET("title=#{title}");
                }
                WHERE("id=#{id}");
            }
        }.toString();
    }
}
