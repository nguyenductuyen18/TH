package com.example.demo12.controller;

import com.example.demo12.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/a")
    public String showForm(Model model){
        model.addAttribute("user", new User());
        return "/indexUser";
    }
    @PostMapping("/user")
    public ModelAndView checkValidation(@Validated @ModelAttribute("user") User user, BindingResult bindingResult, Model model){
       if(bindingResult.hasFieldErrors()){
           return new ModelAndView("/indexUser");
       }else {
           return new ModelAndView("/indexUser");
       }
    }
}
