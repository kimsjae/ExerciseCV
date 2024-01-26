package org.example.exercisecv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(String username, String password, String email) {
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("email : " + email);

        if (username.length() > 16 || password.length() > 16) {
            return "error-404";
        }
        if (username == null || password == null || email == null) {
            return "error-404";
        }

        return "redirect:/main";
    }
}
