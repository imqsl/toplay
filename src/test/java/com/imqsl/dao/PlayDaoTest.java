package com.imqsl.dao;

import com.imqsl.domain.Play;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by imqsl on 2017-10-31.
 */@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class PlayDaoTest {
     @Autowired
     PlayDao playDao;
    @Test
    public void selectById() throws Exception {
        Play play=playDao.selectById(2);
        System.out.println(play);
    }

    @Test
    public void deleteById() throws Exception {
        playDao.deleteById(12);
    }

    @Test
    public void dynaSelect() throws Exception {
        Play play=new Play();
        List<Play> playList=playDao.selectWithParams(play);
        for (Play p:playList) {
            System.out.println(p);
        }
    }

    @Test
    public void dynadDelete() throws Exception {
        Play play=new Play();
        play.setActId("123");
        playDao.delete(play);
    }

    @Test
    public void dynaInsert() throws Exception {
        Play play=playDao.selectById(2);
        playDao.insert(play);

    }

    @Test
    public void dynaUpdate() throws Exception {
        Play play=new Play();
        play.setId(5);
        play.setActId("1");
        playDao.update(play);
    }

}