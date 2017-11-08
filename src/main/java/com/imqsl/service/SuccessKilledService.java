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
    void removeById(Integer id);

    //查询
    List<SuccessKilled> findSuccessKilled(SuccessKilled successKilled);

    /***
     * 根据id查询
     */
    SuccessKilled findSuccessKilledById(Integer id);

    //修改
    void modifySuccessKilled(SuccessKilled successKilled);

}
