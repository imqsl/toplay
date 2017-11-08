package com.imqsl.service.impl;

import com.imqsl.dao.SuccessKilledDao;
import com.imqsl.domain.SuccessKilled;
import com.imqsl.service.SuccessKilledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by imqsl on 2017/9/14.
 */
@Service
public class SuccessKilledServiceImpl implements SuccessKilledService {
    @Autowired
    SuccessKilledDao successKilledDao;

    public void addSuccessKilled(SuccessKilled successKilled) {

        successKilled.setCreateTime(new Date());
        successKilledDao.insert(successKilled);
    }


    public void removeById(Integer id) {
        successKilledDao.deleteById(id);
    }

    @Override
    public List<SuccessKilled> findSuccessKilled(SuccessKilled successKilled) {
        return successKilledDao.selectWithParams(successKilled);
    }

    @Override
    public SuccessKilled findSuccessKilledById(Integer id) {
        return successKilledDao.selectById(id);
    }

    @Override
    public void modifySuccessKilled(SuccessKilled successKilled) {
        successKilledDao.update(successKilled);
    }

}
