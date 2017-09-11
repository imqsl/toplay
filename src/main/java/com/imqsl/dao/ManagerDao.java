package com.imqsl.dao;

import com.imqsl.dao.provider.ManagerDynaSqlProvider;
import com.imqsl.domain.Manager;
import com.imqsl.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static com.imqsl.util.common.ToPlayConstants.MANAGERTABLE;

/**
 * Created by imqsl on 2017/9/8.
 */
public interface ManagerDao {
    //根据id查询管理员
    @Select("select * from " + MANAGERTABLE + " where id=#{id}")
    Manager selectById(Integer in);

    //增加管理员
    @SelectProvider(type = ManagerDynaSqlProvider.class, method = "insertWithParams")
    void dynaInsert(Manager manager);

    //删除管理员
    @Delete("delete from " + MANAGERTABLE + " where id=#{id}")
    void delete(Integer id);

    //动态更新管理员信息
    @SelectProvider(type = ManagerDynaSqlProvider.class, method = "updateWithParams")
    void dynaUpdate(Manager manager);

    //动态查询管理员信息
    @SelectProvider(type = ManagerDynaSqlProvider.class, method = "selectWithParams")
    List<Manager> dynaSelect(Manager manager);

}
