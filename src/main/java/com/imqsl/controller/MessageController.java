package com.imqsl.controller;

import com.imqsl.domain.Message;
import com.imqsl.domain.User;
import com.imqsl.service.MessageService;
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
public class MessageController {
    @Autowired
    MessageService messageService;
    //查询消息
    @RequestMapping("message/selectMessage")
    public String selectUser(@ModelAttribute Message message, Model model) {
        List<Message> messageList = messageService.findMessage(message);
        model.addAttribute("messages", messageList);
        return "message/message";
    }

    //添加消息
    @RequestMapping("message/addMessage")
    public ModelAndView addUser(@ModelAttribute Message message, ModelAndView mv, String flag) {
        if (flag.equals("1")){
            mv.setViewName("message/showAddMessage");
        }else{
            messageService.addMessage(message);
            mv.setViewName("redirect:/message/selectMessage");
        }
        return mv;
    }

    //删除消息
    @RequestMapping("message/deleteMessage")
    public ModelAndView deleteUser(String ids, ModelAndView mv) {
        String idsArray[] = ids.split(",");
        for (String id : idsArray) {
            messageService.removeById(Integer.parseInt(id));
        }
        mv.setViewName("redirect:/message/selectMessage");
        return mv;
    }

    //修改消息
    @RequestMapping("message/updateMessage")
    public ModelAndView updateUser(@ModelAttribute Message message,String flag, ModelAndView mv) {
        if (flag.equals("1")) {
            Message target = messageService.findMessageById(message.getId());
            mv.addObject("message", target);
            mv.setViewName("message/showUpdateMessage");
        } else {
            messageService.modify(message);
            mv.setViewName("redirect:/message/selectMessage");
        }
        return mv;
    }
}
