package com.imqsl.dao;

import com.imqsl.domain.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017/9/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SeckillDaoTest {
    @Autowired
    SeckillDao seckillDao;
    @Test
    public void dynaInsert() throws Exception {
        for (int i=0;i<5;i++){
            Seckill seckill=new Seckill("小米"+i,1000,new Date(),new Date(),new Date());
            seckillDao.dynaInsert(seckill);
        }

    }

    @Test
    public void dynaDelete() throws Exception {
        seckillDao.dynaDelete(5);
    }

    @Test
    public void dynaUpdate() throws Exception {
        Seckill seckill=new Seckill();
        seckill.setSeckill_id(4);
        seckill.setName("荣耀9");
        seckillDao.dynaUpdate(seckill);
    }

    @Test
    public void dynaSelect() throws Exception {
        Seckill seckill=new Seckill();
        seckill.setName("小米");
        List<Seckill> seckillList=seckillDao.dynaSelect(seckill);
        for (Seckill seckill1:seckillList) {
            System.out.println(seckill1.toString());
        }
    }

}