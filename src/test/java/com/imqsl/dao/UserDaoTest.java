package com.imqsl.dao;

import com.imqsl.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.net.UnknownServiceException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017/9/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDaoTest {

    @Autowired
    UserDao userDao;
    @Test
    public void selectBySidAndPassword() throws Exception {
        User user=userDao.selectBySidAndPassword(201622123,"123456");
        System.out.println("-------------");
        System.out.println(user.toString());
    }

    @Test
    public void selectById() throws Exception {
        User user=userDao.selectById(1);
        System.out.println("-------------");
        if (user!=null)
            System.out.println(user.toString());

    }

    @Test
    public void deleteById() throws Exception {
        userDao.deleteById(2);
    }

    @Test
    public void dynaUpdate() throws Exception {
        User user=new User();
        user.setUser_id(4);
        user.setUsername("汪涵");
        userDao.dynaUpdate(user);
    }

    @Test
    public void dynaSelect() throws Exception {
        User user1=new User();
        user1.setStu_id(123);
        List<User> userList=userDao.dynaSelect(user1);
        for (User user:userList) {
            System.out.println(user.toString());
        }

    }

    @Test
    public void count() throws Exception {
        User user1=new User();
        user1.setStu_id(33);
        Integer count=userDao.count(user1);
        System.out.println(count);

    }

    @Test
    public void dynaInsert() throws Exception {
        User user=new User("1","aa","123456",201633011,13636333,"河南省郑州市","郑州大学",100);
        userDao.dynaInsert(user);
    }

}