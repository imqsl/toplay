package com.imqsl.service;

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
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class SuccessKilledServiceTest {
    @Autowired
    SuccessKilledService successKilledService;
    @Test
    public void findSuccessKilledById() throws Exception {
        SuccessKilled successKilled=successKilledService.findSuccessKilledById(1);
        System.out.println(successKilled);
    }

}