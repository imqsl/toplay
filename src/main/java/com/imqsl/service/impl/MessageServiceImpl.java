package com.imqsl.service.impl;

import com.imqsl.dao.MessageDao;
import com.imqsl.domain.Message;
import com.imqsl.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imqsl on 2017/9/14.
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageDao messageDao;

    public void addMessage(Message message) {
        messageDao.insert(message);
    }

    public void removeById(Integer id) {
        messageDao.deleteById(id);
    }

    public void removeByUserId(Integer userId) {
        messageDao.deleteAllByUserId(userId);
    }

    public void modify(Message message) {
        messageDao.update(message);
    }

    public Message findMessageById(Integer id) {
        return messageDao.selectById(id);
    }

    public List<Message> findMessageByUserId(Integer userId) {
        return messageDao.selectByUserId(userId);
    }

    public List<Message> findMessage(Message message) {
        return messageDao.selectWithParams(message);
    }
}
