package com.imqsl.service.impl;

import com.imqsl.dao.ActivityDao;
import com.imqsl.dao.PlayDao;
import com.imqsl.domain.Activity;
import com.imqsl.domain.Play;
import com.imqsl.service.ActivityService;
import com.imqsl.util.common.UUid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by imqsl on 2017/9/14.
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityDao activityDao;

    public void addActivity(Activity activity) {
        String uuid = UUid.getUUid();
        activity.setId(uuid);
        activity.setCreateTime(new Date());
        activity.setStat(1);
        activityDao.insert(activity);
    }

    public void modityActivity(Activity activity) {
        activityDao.update(activity);
    }

    public void cancleActivity(String id) {
        activityDao.deleteById(id);
    }

    public Activity findById(String id) {
        return activityDao.selectById(id);
    }

    public List<Activity> findBySponsorId(Integer sponsorId) {
        return activityDao.selectBySponsorId(sponsorId);
    }

    public List<Activity> findActivity(Activity activity) {
        return activityDao.selectWithParams(activity);
    }
}
