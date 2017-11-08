package com.imqsl.dao;

import com.imqsl.domain.Seckill;
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
public class SeckillDaoTest {
    @Autowired
    SeckillDao seckillDao;
    @Test
    public void insert() throws Exception {
        Seckill seckill=seckillDao.selectById(2);
        seckillDao.insert(seckill);
    }

    @Test
    public void deleteById() throws Exception {
        seckillDao.deleteById(3);
    }

    @Test
    public void selectById() throws Exception {
        Seckill seckill=seckillDao.selectById(2);
        System.out.println(seckill);
    }

    @Test
    public void update() throws Exception {
        Seckill seckill=seckillDao.selectById(2);
        seckill.setName("荣耀8");
        seckillDao.update(seckill);
    }

    @Test
    public void selectWithParams() throws Exception {
        Seckill seckill=new Seckill();
        List<Seckill> seckillList=seckillDao.selectWithParams(seckill);
        for (Seckill s:seckillList) {
            System.out.println(s);
        }
    }

}