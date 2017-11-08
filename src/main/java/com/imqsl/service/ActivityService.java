package com.imqsl.service;

import com.imqsl.domain.Activity;


import java.util.List;

/**
 * Created by imqsl on 2017/9/13.
 */
public interface ActivityService {
    //添加活动
    void addActivity(Activity activity);

    //修改活动
    void modityActivity(Activity activity);

    //删除活动
    void cancleActivity(String id);

    //根据id获得活动
    Activity findById(String id);

    //根据发起者id获得活动
    List<Activity> findBySponsorId(Integer sponsorId);

    //根据类型获得活动
    List<Activity> findActivity(Activity activity);
}
