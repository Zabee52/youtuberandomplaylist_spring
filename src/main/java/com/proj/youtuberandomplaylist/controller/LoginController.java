package com.proj.youtuberandomplaylist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginPage() {
        // 이미 로그인중일시 index로 redirection
        return "login";
    }

    @GetMapping("/agreement")
    public String agreementPage() {
        // 이미 로그인중일시 index로 redirection
        return "agreement";
    }

    @GetMapping("/sign_up")
    public String signupPage() {
        // 이미 로그인중일시 index로 redirection
        return "sign_up";
    }
}
