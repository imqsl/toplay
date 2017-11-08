package com.imqsl.dao;

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
 * Created by imqsl on 2017-10-31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ActivityDaoTest {
    @Autowired
    ActivityDao activityDao;
    @Test
    public void selectBySponsorId() throws Exception {
        List<Activity> activityList=activityDao.selectBySponsorId(0);
        for (Activity a:activityList) {
            System.out.println(a.toString());
        }
    }

    @Test
    public void selectById() throws Exception {
        Activity activity=activityDao.selectById("1");
        System.out.println(activity.toString());
    }

    @Test
    public void deleteById() throws Exception {
        activityDao.deleteById("123333");
    }

    @Test
    public void dynaSelect() throws Exception {
        Activity activity=new Activity();
        List<Activity> activityList=activityDao.selectWithParams(activity);
        for (Activity a:activityList) {
            System.out.println(a.toString());
        }
    }

    @Test
    public void count() throws Exception {
    }

    @Test
    public void dynaInsert() throws Exception {
        Activity activity=new Activity("aaa",1,"aaa","aaa",1,new Date(),new Date());
        activity.setId("015242");
        activityDao.insert(activity);
    }

    @Test
    public void dynaUpdate() throws Exception {
        Activity activity=new Activity();
        activity.setId("015242");
        activity.setActTitle("打篮球");
        activity.setActContent("东苑篮球场");
        activityDao.update(activity);
    }

}