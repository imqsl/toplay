package com.imqsl.dao;

import com.imqsl.domain.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-11-7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SuccessKilledDaoTest {
    @Autowired
    SuccessKilledDao successKilledDao;

    @Test
    public void update() throws Exception {
        SuccessKilled successKilled=successKilledDao.selectById(1);
        successKilled.setStat(0);
        successKilledDao.update(successKilled);
    }

}