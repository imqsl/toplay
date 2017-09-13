package com.imqsl.service;

import com.imqsl.domain.User;

import java.util.List;

/**
 * Created by imqsl on 2017/9/13.
 */
public interface UserService {
    //根据学号和密码登录
    User login(Integer stu_id, String password);

    //根据id查询用户
    User findUserById(Integer user_id);

    //获得所有用户
    List<User> findUser(User user);

    //根据id删除用户
    void removeUserById(Integer user_id);

    //修改用户
    void modifyUser(User user);

    //添加用户
    void addUser(User user);

}
