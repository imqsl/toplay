package com.imqsl.service;

import com.imqsl.domain.SuccessKilled;

import java.util.List;

/**
 * Created by imqsl on 2017/9/13.
 */
public interface SuccessKilledService {
    //添加
    void addSuccessKilled(SuccessKilled successKilled);

    //删除
    void removeBySeckillId(Integer seckill_id, Integer user_id);

    //查询
    List<SuccessKilled> findSeckillId(SuccessKilled successKilled);

}
