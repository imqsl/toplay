package com.imqsl.controller;

import com.imqsl.domain.Play;
import com.imqsl.service.PlayService;
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
public class PlayController {
    @Autowired
    PlayService playService;
    //查询play
    @RequestMapping("play/selectPlay")
    public String selectNote(@ModelAttribute Play play, Model model) {
        List<Play> playList = playService.findPlay(play);
        model.addAttribute("plays", playList);
        return "/play/play";
    }

    //添加play
    @RequestMapping("play/addPlay")
    public ModelAndView addUser(@ModelAttribute Play play, ModelAndView mv, String flag) {
        if (flag.equals("1")){
            mv.setViewName("play/showAddPlay");
        }else{
            playService.addPlay(play);
            mv.setViewName("redirect:/play/selectPlay");
        }
        return mv;
    }

    //删除play
    @RequestMapping("play/deletePlay")
    public ModelAndView deleteUser(String ids, ModelAndView mv) {
        String idsArray[] = ids.split(",");
        for (String id : idsArray) {
            playService.removePlayById(Integer.parseInt(id));
        }
        mv.setViewName("redirect:/play/selectPlay");
        return mv;
    }

    //修改play
    @RequestMapping("play/updatePlay")
    public ModelAndView updateUser(@ModelAttribute Play play,String flag, ModelAndView mv) {
        if (flag.equals("1")) {
            Play target = playService.findPlayById(play.getId());
            mv.addObject("play", target);
            mv.setViewName("play/showUpdatePlay");
        } else {
            playService.modifyPlay(play);
            mv.setViewName("redirect:/play/selectPlay");
        }
        return mv;
    }
}
