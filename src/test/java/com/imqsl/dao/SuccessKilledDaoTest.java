package com.imqsl.dao;

import com.imqsl.domain.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017/9/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SuccessKilledDaoTest {
    @Autowired
    SuccessKilledDao successKilledDao;
    @Test
    public void dynaInsert() throws Exception {
        for (int i=0;i<4;i++){
            SuccessKilled successKilled=new SuccessKilled(1+i,1+i,1,new Date());
            successKilledDao.dynaInsert(successKilled);
        }

    }

    @Test
    public void dynaSelect() throws Exception {
        SuccessKilled successKilled=new SuccessKilled();
        successKilled.setUser_id(2);
        List<SuccessKilled> successKilledList=successKilledDao.dynaSelect(successKilled);
        for (SuccessKilled successKilled1:successKilledList){
            System.out.println(successKilled1.toString());
        }
    }

    @Test
    public void delete() throws Exception {
        successKilledDao.delete(4);
    }

}