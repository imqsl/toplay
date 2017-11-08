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
    @Select("select * from " + MESSAGETABLE + " where id=#{id}")
    Message selectById(Integer id);

    //根据用户id查询本用户的所有信息
    @Select("select * from " + MESSAGETABLE + " where user_id=#{userId}")
    List<Message> selectByUserId(Integer userId);

    //动态查询消息
    @SelectProvider(type = MessageDynaSqlProvider.class, method = "selectWithParams")
    List<Message> selectWithParams(Message message);

    //根据id删除消息
    @Delete("delete from " + MESSAGETABLE + " where id=#{id}")
    void deleteById(Integer id);

    //根据用户id删除本用户所有消息
    @Delete("delete from " + MESSAGETABLE + " where user_id=#{userId}")
    void deleteAllByUserId(Integer userId);

    //动态增加消息
    @SelectProvider(type = MessageDynaSqlProvider.class, method = "insertWithParams")
    void insert(Message message);

    //动态更新
    @SelectProvider(type = MessageDynaSqlProvider.class, method = "updateWithParams")
    void update(Message message);
}
