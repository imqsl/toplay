package com.imqsl.service.impl;

import com.imqsl.dao.SeckillDao;
import com.imqsl.domain.Seckill;
import com.imqsl.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by imqsl on 2017/9/14.
 */
@Service
public class SeckillServiceImpl implements SeckillService {
    @Autowired
    SeckillDao seckillDao;

    public void addSeckill(Seckill seckill)
    {
        seckill.setCreateTime(new Date());
        seckillDao.insert(seckill);
    }

    public void removeSeckill(Integer id) {
        seckillDao.deleteById(id);
    }

    public Seckill findSeckillById(Integer id) {
       return seckillDao.selectById(id);

    }

    public void modifySeckill(Seckill seckill) {
        seckillDao.update(seckill);
    }

    public List<Seckill> findSeckill(Seckill seckill) {
        return seckillDao.selectWithParams(seckill);
    }
}
