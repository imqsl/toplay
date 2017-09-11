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
 * Created by imqsl on 2017/9/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class MessageDaoTest {
    @Autowired
    MessageDao messageDao;
    @Test
    public void dynaSelect() throws Exception {
        Message message=new Message();
        message.setTitle("安全");
        List<Message> messageList=messageDao.dynaSelect(message);
        for (Message message1:messageList) {
            System.out.println(message1.toString());
        }

    }

    @Test
    public void deleteById() throws Exception {
        messageDao.deleteById(4);
    }


    @Test
    public void deleteAllByUserId() throws Exception {
        messageDao.deleteAllByUserId(3);
    }

    @Test
    public void insertMessage() throws Exception {
        Message message=new Message();
        message.setUser_id(3);
        message.setTitle("安全提示");
        message.setContent("您的账号有异常，建议立即修改密码");
        messageDao.dynaInsert(message);

    }
    @Test
    public void dynaUpdate() throws Exception{
        Message message1=new Message();
        message1.setM_id(5);
        message1.setTitle("注意安全");
        messageDao.dynaUpdate(message1);
    }
    @Test
    public void selectByUser_id() throws Exception{
        List<Message> messageList=messageDao.selectByUser_id(1);
        for (Message message:messageList) {
            System.out.println(message.toString());
        }

    }

}