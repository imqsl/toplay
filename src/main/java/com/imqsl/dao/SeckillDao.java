package com.imqsl.dao;

import com.imqsl.dao.provider.SeckillDynaSqlProvider;
import com.imqsl.domain.Seckill;
import org.apache.ibatis.annotations.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

import static com.imqsl.util.common.ToPlayConstants.SECKILLTABLE;

/**
 * Created by imqsl on 2017/9/11.
 */
public interface SeckillDao {
    //动态增加
    @InsertProvider(type = SeckillDynaSqlProvider.class, method = "insertWithParams")
    void insert(Seckill seckill);

    //根据id删除
    @Delete("delete from " + SECKILLTABLE + " where id=#{id}")
    void deleteById(Integer id);

    //根据id查询
    @Select("select * from "+SECKILLTABLE+" where id=#{id}")
    Seckill selectById(Integer id);

    //动态修改
    @UpdateProvider(type = SeckillDynaSqlProvider.class, method = "updateWithParams")
    void update(Seckill seckill);

    //动态查询
    @SelectProvider(type = SeckillDynaSqlProvider.class, method = "selectWithParams")
    List<Seckill> selectWithParams(Seckill seckill);
}
