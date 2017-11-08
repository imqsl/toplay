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
    //根据发起者id查询活动
    @Select("select * from " + ACTIVITYTABLE + " where sponsor_id=#{sponsorId}")
    List<Activity> selectBySponsorId(Integer sponsorId);


    //根据活动id查询活动
    @Select("select * from " + ACTIVITYTABLE + " where id=#{id}")
    Activity selectById(String id);


    //根据id删除活动
    @Delete("delete from " + ACTIVITYTABLE + " where id=#{id}")
    void deleteById(String id);

    //动态查询
    @SelectProvider(type = ActivityDynaSqlProvider.class, method = "selectWithParams")
    List<Activity> selectWithParams(Activity activity);


    //动态查询活动总数
    @SelectProvider(type = ActivityDynaSqlProvider.class, method = "count")
    Integer count(Activity activity);

    //动态插入
    @SelectProvider(type = ActivityDynaSqlProvider.class, method = "insertWithParams")
    void insert(Activity activity);

    //动态更新
    @SelectProvider(type = ActivityDynaSqlProvider.class, method = "updateWithParams")
    void update(Activity activity);

}
