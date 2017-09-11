package com.imqsl.dao;

import com.imqsl.dao.provider.MessageDynaSqlProvider;
import com.imqsl.domain.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static com.imqsl.util.common.ToPlayConstants.MESSAGETABLE;

/**
 * Created by imqsl on 2017/9/8.
 */
public interface MessageDao {
    //根据id查询消息
    @Select("select * from " + MESSAGETABLE + " where m_id=#{m_id}")
    Message selectByM_id(Integer m_id);

    //根据用户id查询本用户的所有信息
    @Select("select * from " + MESSAGETABLE + " where user_id=#{user_id}")
    List<Message> selectByUser_id(Integer user_id);

    //动态查询消息
    @SelectProvider(type = MessageDynaSqlProvider.class, method = "selectWithParams")
    List<Message> dynaSelect(Message message);

    //根据id删除消息
    @Delete("delete from " + MESSAGETABLE + " where m_id=#{m_id}")
    void deleteById(Integer m_id);

    //根据用户id删除本用户所有消息
    @Delete("delete from " + MESSAGETABLE + " where user_id=#{user_id}")
    void deleteAllByUserId(Integer user_id);

    //动态增加消息
    @SelectProvider(type = MessageDynaSqlProvider.class, method = "insertWithParams")
    void dynaInsert(Message message);

    //动态更新
    @SelectProvider(type = MessageDynaSqlProvider.class, method = "updateWithParams")
    void dynaUpdate(Message message);
}
