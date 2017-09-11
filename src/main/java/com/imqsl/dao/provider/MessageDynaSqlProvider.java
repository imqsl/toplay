package com.imqsl.dao.provider;

import com.imqsl.domain.Message;
import org.apache.ibatis.jdbc.SQL;

import static com.imqsl.util.common.ToPlayConstants.MESSAGETABLE;

/**
 * Created by imqsl on 2017/9/11.
 */
public class MessageDynaSqlProvider {
    //动态查询
    public String selectWithParams(final Message message){
        return new SQL(){
            {
                SELECT("*");
                FROM(MESSAGETABLE);
                if (message.getUser_id()!=null &&!message.getUser_id().equals("")){
                    WHERE(" user_id LIKE CONCAT ('%',#{user_id},'%')");
                }
                if (message.getContent()!=null &&!message.getContent().equals("")){
                    WHERE(" content LIKE CONCAT ('%',#{content},'%')");
                }
                if (message.getTitle()!=null &&!message.getTitle().equals("")){
                    WHERE(" title LIKE CONCAT ('%',#{title},'%')");
                }
            }
        }.toString();
    }
    //动态插入
    public String insertWithParams(final Message message){
        return new SQL(){
            {
                INSERT_INTO(MESSAGETABLE);
                if (message.getUser_id()!=null &&!message.getUser_id().equals("")){
                    VALUES("user_id","#{user_id}");
                }
                if (message.getContent()!=null &&!message.getContent().equals("")){
                    VALUES("content","#{content}");
                }
                if (message.getTitle()!=null &&!message.getTitle().equals("")){
                    VALUES("title","#{title}");
                }
            }
        }.toString();
    }
    //动态更新
    public String updateWithParams(final Message message){
        return new SQL(){
            {
                UPDATE(MESSAGETABLE);
                if (message.getUser_id()!=null &&!message.getUser_id().equals("")){
                    SET("user_id=#{user_id}");
                }
                if (message.getContent()!=null &&!message.getContent().equals("")){
                    SET("content=#{content}");
                }
                if (message.getTitle()!=null &&!message.getTitle().equals("")){
                    SET("title=#{title}");
                }
                WHERE("m_id=#{m_id}");
            }
        }.toString();
    }
}
