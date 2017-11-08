package com.imqsl.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imqsl.domain.User;
import com.imqsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.List;

import static com.imqsl.util.common.ToPlayConstants.USER_SESSION;

/**
 * Created by imqsl on 2017/9/25.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //查询用户
    @RequestMapping("user/selectUser")
    public String selectUser(@ModelAttribute User user, Model model,int pageNum) {
        PageHelper.startPage(pageNum,3);
        List<User> userList = userService.findUser(user);
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        long count=pageInfo.getTotal();
        model.addAttribute("users", userList);
        if (count%3!=0){
            count=(count/3)+1;
        }else{
            count=count/3;
        }
        List<Integer> testUserList=new ArrayList<Integer>();
        for (int i=0;i<count;i++){
            testUserList.add(i);
        }
        model.addAttribute("count",count);
       model.addAttribute("pageInfo",testUserList);
        model.addAttribute("pageNum",pageNum);
        return "/user/user";
    }

    //添加用户
    @RequestMapping("user/addUser")
    public ModelAndView addUser(@ModelAttribute User user, ModelAndView mv,String flag) {
        if (flag.equals("1")){
            mv.setViewName("user/showAddUser");
        }else{
            userService.addUser(user);
            mv.setViewName("redirect:/user/selectUser?pageNum=1");
        }
        return mv;
    }

    //删除用户
    @RequestMapping("user/deleteUser")
    public ModelAndView deleteUser(String ids, ModelAndView mv) {
        String idsArray[] = ids.split(",");
        for (String id : idsArray) {
            userService.removeUserById(Integer.parseInt(id));
        }
        mv.setViewName("redirect:/user/selectUser?pageNum=1");
        return mv;
    }

    //修改用户
    @RequestMapping("user/updateUser")
    public ModelAndView updateUser(@ModelAttribute User user,String flag, ModelAndView mv) {
        if (flag.equals("1")) {
            User target = userService.findUserById(user.getId());
            mv.addObject("user", target);
            mv.setViewName("user/showUpdateUser");
        } else {
            userService.modifyUser(user);
            mv.setViewName("redirect:/user/selectUser?pageNum=1");
        }
        return mv;
    }
}
