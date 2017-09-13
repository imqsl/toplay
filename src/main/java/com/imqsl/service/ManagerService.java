package com.imqsl.service;

import com.imqsl.domain.Manager;

import java.util.List;

/**
 * Created by imqsl on 2017/9/13.
 */
public interface ManagerService {
    //根据id查询
    Manager findManagerById(Integer id);

    //获得所有管理员
    List<Manager> findManager(Manager manager);

    //添加管理员
    void addManager(Manager manager);

    //根据id删除管理员
    void removeManager(Integer id);

    //修改管理员
    void modifyManager(Manager manager);
}
