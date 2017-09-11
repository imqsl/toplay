package com.imqsl.dao;

import com.imqsl.dao.provider.ActivityDynaSqlProvider;
import com.imqsl.domain.Activity;
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
public class ActivityDaoTest {
    @Autowired
    ActivityDao activityDao;
    @Test
    public void selectById() throws Exception {
        Activity activity=activityDao.selectById(2);
        System.out.println(activity.toString());
    }

    @Test
    public void deleteById() throws Exception {
        activityDao.deleteById(4);
    }

    @Test
    public void dynaSelect() throws Exception {
        Activity activity=new Activity();
        activity.setAct_title("吃火锅");
        List<Activity> activityList=activityDao.dynaSelect(activity);
        for (Activity activity1:activityList) {
            System.out.println(activity1.toString());
        }

    }

    @Test
    public void count() throws Exception {
        Activity activity=new Activity();
       Integer count=activityDao.count(activity);
            System.out.println(count);
    }

    @Test
    public void dynaInsert() throws Exception {
        Activity activity=new Activity("跑步","在东苑体育场跑步","体育",1,new Date(),new Date());
        activityDao.dynaInsert(activity);
    }

    @Test
    public void dynaUpdate() throws Exception {
        Activity activity=new Activity();
        activity.setAct_id(2);
        activity.setStatus(0);
        activityDao.dynaUpdate(activity);
    }

}