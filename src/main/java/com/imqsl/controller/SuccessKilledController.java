package com.imqsl.controller;

import com.imqsl.domain.SuccessKilled;
import com.imqsl.service.SuccessKilledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by imqsl on 2017-10-13.
 */
@Controller
public class SuccessKilledController {

    @Autowired
    SuccessKilledService successKilledService;

    @RequestMapping("successKilled/selectSuccessKilled")
    public String selectActivity(Model model, @ModelAttribute SuccessKilled successKilled){
        List<SuccessKilled> successKilledList=successKilledService.findSuccessKilled(successKilled);
        model.addAttribute("successKilleds",successKilledList);
        return "successkilled/successKilled";
    }

    //添加秒杀详情
    @RequestMapping("successKilled/addSuccessKilled")
    public ModelAndView addUser(@ModelAttribute SuccessKilled successKilled, ModelAndView mv, String flag) {
        if (flag.equals("1")){
            mv.setViewName("successkilled/showAddSuccessKilled");
        }else{
            successKilledService.addSuccessKilled(successKilled);
            mv.setViewName("redirect:/successKilled/selectSuccessKilled");
        }
        return mv;
    }

    //删除秒杀详情
    @RequestMapping("successKilled/deleteSuccessKilled")
    public ModelAndView deleteUser(String ids, ModelAndView mv) {
        String idsArray[] = ids.split(",");
        for (String id : idsArray) {
            successKilledService.removeById(Integer.parseInt(id));
        }
        mv.setViewName("redirect:/successKilled/selectSuccessKilled");
        return mv;
    }

    //修改秒杀详情
    @RequestMapping("successKilled/updateSuccessKilled")
    public ModelAndView updateUser(@ModelAttribute SuccessKilled successKilled,String flag, ModelAndView mv) {
      if (flag.equals("1")){
          SuccessKilled target = successKilledService.findSuccessKilledById(successKilled.getId());
          mv.addObject("successKilled", target);
          mv.setViewName("successkilled/showUpdateSuccessKilled");
      }else {
          successKilledService.modifySuccessKilled(successKilled);
          mv.setViewName("redirect:/successKilled/selectSuccessKilled");
      }
        return mv;
    }
}
