package com.imqsl.controller;

import com.imqsl.domain.Note;
import com.imqsl.service.NoteService;
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
public class NoteController {
    @Autowired
    private NoteService noteService;


    //查询通知
    @RequestMapping("note/selectNote")
    public String selectNote(@ModelAttribute Note note, Model model) {
        List<Note> noteList = noteService.findNote(note);
        model.addAttribute("notes", noteList);
        return "/note/note";
    }

    //添加通知
    @RequestMapping("note/addNote")
    public ModelAndView addUser(@ModelAttribute Note note, ModelAndView mv,String flag) {
        if (flag.equals("1")){
            mv.setViewName("note/showAddNote");
        }else{
            noteService.addNote(note);
            mv.setViewName("redirect:/note/selectNote");
        }
        return mv;
    }

    //删除通知
    @RequestMapping("note/deleteNote")
    public ModelAndView deleteUser(String ids, ModelAndView mv) {
        String idsArray[] = ids.split(",");
        for (String id : idsArray) {
            noteService.removeNote(Integer.parseInt(id));
        }
        mv.setViewName("redirect:/note/selectNote");
        return mv;
    }

    //修改通知
    @RequestMapping("note/updateNote")
    public ModelAndView updateUser(@ModelAttribute Note note,String flag, ModelAndView mv) {
        if (flag.equals("1")) {
            Note target = noteService.findNoteById(note.getId());
            mv.addObject("note", target);
            mv.setViewName("note/showUpdateNote");
        } else {
            noteService.modifyNote(note);
            mv.setViewName("redirect:/note/selectNote");
        }
        return mv;
    }
}
