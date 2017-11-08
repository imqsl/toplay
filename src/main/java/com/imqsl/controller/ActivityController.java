package com.imqsl.controller;

import com.imqsl.domain.Activity;
import com.imqsl.service.ActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by imqsl on 2017/10/12.
 */
@Controller
public class ActivityController {
    @Autowired
    ActivityService activityService;
    static final Logger LOG = LoggerFactory.getLogger(ActivityController.class);

    //查询活动
    @RequestMapping("activity/selectActivity")
    public String selectActivity(Model model, @ModelAttribute Activity activity){
        List<Activity> activityList=activityService.findActivity(activity);
        model.addAttribute("activities",activityList);
        return "activity/activity";
    }
    //添加活动
    @RequestMapping("activity/addActivity")
    public ModelAndView addUser(@ModelAttribute Activity activity, ModelAndView mv,String flag) {
        if (flag.equals("1")){
            mv.setViewName("activity/showAddActivity");
        }else{
            activityService.addActivity(activity);
            mv.setViewName("redirect:/activity/selectActivity");
        }
        return mv;
    }

    //删除活动
    @RequestMapping("activity/deleteActivity")
    public ModelAndView deleteUser(String ids, ModelAndView mv) {
        String idsArray[] = ids.split(",");
        for (String id : idsArray) {
            activityService.cancleActivity(id);
        }
        mv.setViewName("redirect:/activity/selectActivity");
        return mv;
    }

    //修改活动
    @RequestMapping("activity/updateActivity")
    public ModelAndView updateUser(@ModelAttribute Activity activity,String flag, ModelAndView mv) {

        if (flag.equals("1")) {
            Activity target = activityService.findById(activity.getId());
            mv.addObject("activity", target);
            mv.setViewName("activity/showUpdateActivity");
        } else {
            activityService.modityActivity(activity);
            mv.setViewName("redirect:/activity/selectActivity");
        }
        return mv;
    }
}
