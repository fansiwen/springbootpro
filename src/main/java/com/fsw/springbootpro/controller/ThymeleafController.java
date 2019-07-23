package com.fsw.springbootpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
    @RequestMapping(value = "/")
    public String index(Model model){
        //注入变量到模板当中
        model.addAttribute("name","hello world");
        return "index";
    }
}
