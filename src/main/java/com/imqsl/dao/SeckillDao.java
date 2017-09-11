package com.imqsl.dao;

import com.imqsl.dao.provider.SeckillDynaSqlProvider;
import com.imqsl.domain.Seckill;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

import static com.imqsl.util.common.ToPlayConstants.SECKILLTABLE;

/**
 * Created by imqsl on 2017/9/11.
 */
public interface SeckillDao {
    //动态增加
    @InsertProvider(type = SeckillDynaSqlProvider.class, method = "insertWithParams")
    void dynaInsert(Seckill seckill);

    //根据id删除
    @Delete("delete from " + SECKILLTABLE + " where seckill_id=#{seckill_id}")
    void dynaDelete(Integer seckill_id);

    //动态修改
    @UpdateProvider(type = SeckillDynaSqlProvider.class, method = "updateWithParams")
    void dynaUpdate(Seckill seckill);

    //动态查询
    @SelectProvider(type = SeckillDynaSqlProvider.class, method = "selectWithParams")
    List<Seckill> dynaSelect(Seckill seckill);
}
