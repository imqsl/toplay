package com.imqsl.dao;

import com.imqsl.dao.provider.UserDynaSqlProvider;
import com.imqsl.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

import static com.imqsl.util.common.ToPlayConstants.USERTABLE;

/**
 * Created by imqsl on 2017/9/7.
 */

public interface UserDao {
    //根据学号和密码来查询用户
    @Select("select * from " + USERTABLE + " where stu_id=#{stuId} and password=#{password}")
    User selectBySidAndPassword(@Param("stuId") Long stuId, @Param("password") String password);

    //根据id来查询用户
    @Select("select * from " + USERTABLE + " where id=#{id}")
    User selectById(int id);

    //根据id来删除用户
    @Delete("delete from " + USERTABLE + " where id=#{id}")
    void deleteById(int id);

    //动态修改
    @SelectProvider(type = UserDynaSqlProvider.class, method = "dynaUpdate")
    void update(User user);

    //动态查询
    @SelectProvider(type = UserDynaSqlProvider.class, method = "dynaSelect")
    List<User> selectWithParams(User user);

    //根据参数查询用户总数
    @SelectProvider(type = UserDynaSqlProvider.class, method = "count")
    int count(User user);

    //动态插入用户
    @SelectProvider(type = UserDynaSqlProvider.class, method = "dynaInsert")
    void insert(User user);
}
