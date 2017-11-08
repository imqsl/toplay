package com.imqsl.dao;

import com.imqsl.domain.Manager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class ManagerDaoTest {
    @Autowired
    ManagerDao managerDao;
    Logger logger= LoggerFactory.getLogger(ManagerDaoTest.class);
    @Test
    public void selectBySidAndPassword() throws Exception {
        Manager manager=managerDao.selectByNameAndPassword("admin","123456");
        System.out.println(manager);

    }

    @Test
    public void selectById() throws Exception {
        Manager manager=managerDao.selectById(1);
        System.out.println(manager);
    }

    @Test
    public void dynaInsert() throws Exception {
        Manager manager=new Manager("qin","123456",1);
        managerDao.insert(manager);
    }

    @Test
    public void delete() throws Exception {
        managerDao.deleteById(5);
    }

    @Test
    public void dynaUpdate() throws Exception {
        Manager manager=new Manager();
        manager.setId(1);
        manager.setPassword("123456");
        managerDao.update(manager);
    }

    @Test
    public void dynaSelect() throws Exception {
        Manager manager=new Manager();
       List<Manager> managerList= managerDao.selectWithParams(manager);
        for (Manager m:managerList) {
            logger.debug(m.toString());
        }
    }

}