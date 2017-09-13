package com.imqsl.service;

import com.imqsl.domain.Message;

import java.util.List;

/**
 * Created by imqsl on 2017/9/13.
 */
public interface MessageService {
    //添加消息
    void addMessage(Message message);

    //根据id删除消息
    void removeById(Integer m_id);

    //根据用户id删除消息
    void removeByUserId(Integer user_id);

    //修改消息
    void modify(Message message);

    //根据id查询消息
    Message findMessageById(Integer m_id);

    //根据用户id查询消息;
    List<Message> findMessageByUserId(Integer user_id);

    //查询消息
    List<Message> findMessage(Message message);
}
