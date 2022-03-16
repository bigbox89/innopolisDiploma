package com.gitlab.ufapetr.controllers;

import com.gitlab.ufapetr.forms.CustomerForm;
import com.gitlab.ufapetr.forms.SignUpForm;
import com.gitlab.ufapetr.services.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class SignUpController {

    private final SignUpService signUpService;

    @GetMapping ("/signup")
    public String getSignUp() {
        return "signup";
    }

    @PostMapping ("/signup")
    public String addUser(SignUpForm form){
        //создаем пользователя
        signUpService.addUser(form);
        System.out.println("Добавлен пользователь с Именем ");
        return "redirect:/signin";
    }
}
