package com.imqsl.service.impl;

import com.imqsl.dao.ManagerDao;
import com.imqsl.domain.Manager;
import com.imqsl.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imqsl on 2017/9/14.
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    ManagerDao managerDao;

    public Manager login(String name, String password) {
        return managerDao.selectByNameAndPassword(name, password);
    }

    public Manager findManagerById(Integer managerId) {
        return managerDao.selectById(managerId);
    }

    public List<Manager> findManager(Manager manager) {
        return managerDao.selectWithParams(manager);
    }

    public void addManager(Manager manager) {
        managerDao.insert(manager);
    }

    public void removeManager(Integer managerId) {
        managerDao.deleteById(managerId);
    }

    public void modifyManager(Manager manager) {
        managerDao.update(manager);
    }
}
