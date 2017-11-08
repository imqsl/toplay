package com.imqsl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 动态页面跳转
 */
@Controller
public class FormController
{
    @RequestMapping( "/{formName}")
    public String loginForm(@PathVariable String formName){
        //动态跳转页面
        return formName;
    }


}
