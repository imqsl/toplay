package com.imqsl.dao;

import com.imqsl.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-11-2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDaoTest {
    @Autowired
    UserDao userDao;
    @Test
    public void selectBySidAndPassword() throws Exception {

    }

    @Test
    public void selectById() throws Exception {
        User user=userDao.selectById(1);
        System.out.println(user);
    }

    @Test
    public void deleteById() throws Exception {
        userDao.deleteById(14);
    }

    @Test
    public void update() throws Exception {
        User user=userDao.selectById(1);
        user.setGender("女");
        userDao.update(user);
    }

    @Test
    public void selectWithParams() throws Exception {
        User user=new User();
        List<User> userList=userDao.selectWithParams(user);
        for (User u:userList) {
            System.out.println(u);
        }
    }

    @Test
    public void count() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        User user=userDao.selectById(1);
        userDao.insert(user);
    }

}