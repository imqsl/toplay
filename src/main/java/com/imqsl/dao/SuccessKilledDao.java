package com.imqsl.dao;

import com.imqsl.dao.provider.SuccessKilledDynaSqlProvider;
import com.imqsl.domain.SuccessKilled;
import org.apache.ibatis.annotations.*;

import java.util.List;

import static com.imqsl.util.common.ToPlayConstants.SUCCESSKILLEDTABLE;

/**
 * Created by imqsl on 2017/9/11.
 */
public interface SuccessKilledDao {
    //动态插入
    @InsertProvider(type = SuccessKilledDynaSqlProvider.class, method = "insertWithParams")
    void insert(SuccessKilled successKilled);

    //动态查询
    @SelectProvider(type = SuccessKilledDynaSqlProvider.class, method = "selectWithParams")
    List<SuccessKilled> selectWithParams(SuccessKilled successKilled);

    //根据id删除
    @Delete("delete from " + SUCCESSKILLEDTABLE + " where id=#{id}")
    void deleteById(Integer id);

    //根据id进行查询
    @Select("select * from "+SUCCESSKILLEDTABLE+" where id=#{id}")
    SuccessKilled selectById(Integer id);

    //动态修改
    @UpdateProvider(type = SuccessKilledDynaSqlProvider.class, method = "updateWithParams")
    void update(SuccessKilled successKilled);

}
