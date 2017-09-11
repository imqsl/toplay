package com.imqsl.dao;

import com.imqsl.domain.Manager;
import com.imqsl.domain.Message;
import com.imqsl.domain.User;
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
public class ManagerDaoTest {
    @Autowired
    ManagerDao managerDao;
    @Test
    public void dynaInsert() throws Exception {
        Manager manager=new Manager("zhang","123456");
        managerDao.dynaInsert(manager);
    }

    @Test
    public void delete() throws Exception {
        managerDao.delete(3);
    }

    @Test
    public void update() throws Exception {
        Manager manager=new Manager();
        manager.setId(5);
        manager.setName("zhang");
        managerDao.dynaUpdate(manager);
    }
    @Test
    public void dynaSelect() throws Exception{
        Manager manager=new Manager();
        manager.setName("in");
        List<Manager> managerList=managerDao.dynaSelect(manager);
        for (Manager manager1:managerList) {
            System.out.println(manager1.toString());
        }
    }


}