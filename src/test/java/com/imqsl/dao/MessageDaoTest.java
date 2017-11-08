package com.imqsl.dao;

import com.imqsl.domain.Message;
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
public class MessageDaoTest {
    @Autowired
    MessageDao messageDao;
    @Test
    public void selectByMessageId() throws Exception {
        Message message=messageDao.selectById(1);
        System.out.println(message);
    }

    @Test
    public void selectByUserId() throws Exception {
        List<Message> messageList=messageDao.selectByUserId(2);
        for (Message m:messageList) {
            System.out.println(m);
        }
    }

    @Test
    public void dynaSelect() throws Exception {
        Message message=new Message();
        List<Message> messageList=messageDao.selectWithParams(message);
        for (Message m:messageList) {
            System.out.println(m);
        }
    }

    @Test
    public void deleteById() throws Exception {
        messageDao.deleteById(7);

    }

    @Test
    public void deleteAllByUserId() throws Exception {
        messageDao.deleteAllByUserId(2);
    }

    @Test
    public void dynaInsert() throws Exception {
        Message message=messageDao.selectById(1);
        messageDao.insert(message);
    }

    @Test
    public void dynaUpdate() throws Exception {
        Message message=messageDao.selectById(1);
        message.setUserId(2);
        messageDao.update(message);
    }

}