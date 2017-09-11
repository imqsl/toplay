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
 * Created by imqsl on 2017/9/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class PlayDaoTest {
    @Autowired
    PlayDao playDao;
    @Test
    public void dynaSelect() throws Exception {
        Play play=new Play();
        play.setDescription("od");
        List<Play> playList=playDao.dynaSelect(play);
        for (Play play1:playList){
            System.out.println(play1.toString());
        }
    }

    @Test
    public void dynadDelete() throws Exception {
        Play play=new Play();
        play.setAct_id(3);
        playDao.dynadDelete(play);
    }

    @Test
    public void dynaInsert() throws Exception {
        for (int i=0;i<5;i++){
            Play play=new Play(1+i,2+i,3+i,1,"good"+i);
            playDao.dynaInsert(play);
        }

    }

    @Test
    public void dynaUpdate() throws Exception {
        Play play=new Play();
        play.setP_id(5);
        play.setSponsor_id(3);
        playDao.dynaUpdate(play);
    }

}