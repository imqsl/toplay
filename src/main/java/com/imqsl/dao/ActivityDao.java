package com.imqsl.dao;

import com.imqsl.dao.provider.ActivityDynaSqlProvider;
import com.imqsl.domain.Activity;
import org.apache.ibatis.annotations.*;
import sun.nio.cs.ext.MacGreek;

import java.util.List;

import static com.imqsl.util.common.ToPlayConstants.ACTIVITYTABLE;


/**
 * Created by imqsl on 2017/9/8.
 */
public interface ActivityDao {
    //根据id查询活动
    @Select("select * from " + ACTIVITYTABLE + " where act_id=#{act_id}")
    Activity selectById(Integer act_id);

    //根据id删除活动
    @Delete("delete from " + ACTIVITYTABLE + " where act_id=#{act_id}")
    void deleteById(Integer act_id);

    //动态查询
    @SelectProvider(type = ActivityDynaSqlProvider.class, method = "selectWithParams")
    List<Activity> dynaSelect(Activity activity);

    //动态查询活动总数
    @SelectProvider(type = ActivityDynaSqlProvider.class, method = "count")
    Integer count(Activity activity);

    //动态插入
    @SelectProvider(type = ActivityDynaSqlProvider.class, method = "insertWithParams")
    void dynaInsert(Activity activity);

    //动态更新
    @SelectProvider(type = ActivityDynaSqlProvider.class, method = "updateWithParams")
    void dynaUpdate(Activity activity);

}
