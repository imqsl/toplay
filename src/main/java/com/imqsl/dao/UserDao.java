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

public interface UserDao{
    //根据学号和密码来查询用户
    @Select("select * from "+USERTABLE+" where stu_id=#{stu_id} and password=#{password}")
    User selectBySidAndPassword(@Param("stu_id") int stu_id,@Param("password") String password);
    //根据id来查询用户
    @Select("select * from "+USERTABLE+" where user_id=#{user_id}")
    User selectById(int user_id);
    //根据id来删除用户
    @Delete("delete from "+USERTABLE+" where user_id=#{user_id}")
    void deleteById(int user_id);
    //动态修改
    @SelectProvider(type = UserDynaSqlProvider.class,method = "dynaUpdate")
    void dynaUpdate(User user);
    //动态查询
    @SelectProvider(type = UserDynaSqlProvider.class,method = "dynaSelect")
    List<User> dynaSelect(User user);
    //根据参数查询用户总数
    @SelectProvider(type = UserDynaSqlProvider.class,method = "count")
    int count(User user);
    //动态插入用户
    @SelectProvider(type = UserDynaSqlProvider.class,method = "dynaInsert")
    void dynaInsert(User user);
}
