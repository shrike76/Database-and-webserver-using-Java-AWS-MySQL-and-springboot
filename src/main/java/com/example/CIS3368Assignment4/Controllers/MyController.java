package com.example.CIS3368Assignment4.Controllers;

import com.example.CIS3368Assignment4.Models.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
    @Autowired
    StudentRepo sRepo;
    @RequestMapping("/view")
    public ModelAndView view(){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("students", sRepo.findAll());
        return mv;
    }
}
