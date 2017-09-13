package com.imqsl.service;

import com.imqsl.domain.Activity;
import com.imqsl.domain.Play;

import java.util.List;

/**
 * Created by imqsl on 2017/9/13.
 */
public interface ActivityService {
    //发起活动
    void addActivity(Activity activity, Play play);

    //修改活动
    void modityTitle(Activity activity);

    //解散活动
    void cancleActivity(Integer act_id);

    //根据id获得活动
    Activity findById(Integer act_id);

    //根据类型获得活动
    List<Activity> findActivity(Activity activity);
}
