package com.imqsl.service.impl;

import com.imqsl.dao.UserDao;
import com.imqsl.domain.User;
import com.imqsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imqsl on 2017/9/14.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public User login(Long stu_id, String password) {
        return userDao.selectBySidAndPassword(stu_id, password);
    }

    public User findUserById(Integer id) {
        return userDao.selectById(id);
    }

    public List<User> findUser(User user) {
        return userDao.selectWithParams(user);
    }

    public void removeUserById(Integer id) {
        userDao.deleteById(id);

    }

    public void modifyUser(User user) {
        userDao.update(user);
    }

    public void addUser(User user) {
        user.setCredit(100);
        userDao.insert(user);
    }
}
