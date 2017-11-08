package com.imqsl.controller;

import com.imqsl.domain.Seckill;
import com.imqsl.service.SeckillService;
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
public class SeckillController {
    @Autowired
    SeckillService seckillService;

    //查询秒杀
    @RequestMapping("seckill/selectSeckill")
    public String selectActivity(Model model, @ModelAttribute Seckill seckill){
        List<Seckill> seckillList=seckillService.findSeckill(seckill);
        model.addAttribute("seckills",seckillList);
        return "seckill/seckill";
    }

    //添加秒杀
    @RequestMapping("seckill/addSeckill")
    public ModelAndView addUser(@ModelAttribute Seckill seckill, ModelAndView mv, String flag) {
        if (flag.equals("1")){
            mv.setViewName("seckill/showAddSeckill");
        }else{
            seckillService.addSeckill(seckill);
            mv.setViewName("redirect:/seckill/selectSeckill");
        }
        return mv;
    }

    //删除秒杀
    @RequestMapping("seckill/deleteSeckill")
    public ModelAndView deleteUser(String ids, ModelAndView mv) {
        String idsArray[] = ids.split(",");
        for (String id : idsArray) {
            seckillService.removeSeckill(Integer.parseInt(id));
        }
        mv.setViewName("redirect:/seckill/selectSeckill");
        return mv;
    }

    //修改秒杀
    @RequestMapping("seckill/updateSeckill")
    public ModelAndView updateUser(@ModelAttribute Seckill seckill,String flag, ModelAndView mv) {
        if (flag.equals("1")) {
            Seckill target = seckillService.findSeckillById(seckill.getId());
            mv.addObject("seckill", target);
            mv.setViewName("seckill/showUpdateSeckill");
        } else {
            seckillService.modifySeckill(seckill);
            mv.setViewName("redirect:/seckill/selectSeckill");
        }
        return mv;
    }
}
