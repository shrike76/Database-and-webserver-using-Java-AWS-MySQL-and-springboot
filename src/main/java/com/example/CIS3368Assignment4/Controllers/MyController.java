package com.example.CIS3368Assignment4.Controllers;

import com.example.CIS3368Assignment4.Models.Student;
import com.example.CIS3368Assignment4.Models.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController{

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
    @RequestMapping("/edit2")
    public String edit() {
        return "edit2";
    }

    @RequestMapping(value="/findByID", method= RequestMethod.POST)
    public ModelAndView findByID(@RequestParam("id") int id){
        ModelAndView mv= new ModelAndView("edit3");
        mv.addObject("student", sRepo.findById(id).get());
        return mv;
    }

    @RequestMapping(value="/save", method= RequestMethod.POST)
    public String Save(@RequestParam("id") int id, @RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("age") int age){
        Student s = new Student(id, fname, lname, age);
        sRepo.save(s);
        return "index";
    }

}
