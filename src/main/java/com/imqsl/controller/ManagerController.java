package com.imqsl.controller;

import com.imqsl.domain.Manager;
import com.imqsl.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

import static com.imqsl.util.common.ToPlayConstants.MANAGER_SESSION;

/**
 * Created by imqsl on 2017-10-16.
 */
@Controller
public class ManagerController {
    @Autowired
    ManagerService managerService;


    //判断登陆
    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("name") String name, @RequestParam("password") String password, ModelAndView mv, HttpSession session) {
        Manager manager = managerService.login(name, password);
        if (manager != null) {
            session.setAttribute(MANAGER_SESSION, manager);
            mv.setViewName("redirect:/main");
        } else {
            mv.addObject("message", "用户名或者密码错误，请重新输入！");
            mv.setViewName("forward:/loginForm");

        }
        return mv;
    }

    //判断登陆
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
       Manager manager= (Manager) session.getAttribute(MANAGER_SESSION);
       session.removeAttribute(MANAGER_SESSION);
       return "loginForm";
    }

    //查询管理员
    @RequestMapping("mymanager/selectManager")
    public String selectActivity(Model model, @ModelAttribute Manager manager){
        List<Manager> managerList=managerService.findManager(manager);
        model.addAttribute("managers",managerList);
        return "mymanager/manager";
    }

    //添加管理员
    @RequestMapping("mymanager/addManager")
    public ModelAndView addUser(@ModelAttribute Manager manager, ModelAndView mv, String flag) {
        if (flag.equals("1")){
            mv.setViewName("mymanager/showAddManager");
        }else{
            managerService.addManager(manager);
            mv.setViewName("redirect:/mymanager/selectManager");
        }
        return mv;
    }

    //删除管理员
    @RequestMapping("mymanager/deleteManager")
    public ModelAndView deleteUser(String ids, ModelAndView mv) {
        String idsArray[] = ids.split(",");
        for (String id : idsArray) {
            managerService.removeManager(Integer.parseInt(id));
        }
        mv.setViewName("redirect:/mymanager/selectManager");
        return mv;
    }

    //修改管理员
    @RequestMapping("mymanager/updateManager")
    public ModelAndView updateUser(@ModelAttribute Manager manager,String flag, ModelAndView mv) {
        if (flag.equals("1")) {
            Manager target = managerService.findManagerById(manager.getId());
            mv.addObject("manager", target);
            mv.setViewName("mymanager/showUpdateManager");
        } else {
            managerService.modifyManager(manager);
            mv.setViewName("redirect:/mymanager/selectManager");
        }
        return mv;
    }
}
