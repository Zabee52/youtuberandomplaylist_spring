package com.proj.youtuberandomplaylist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String indexPage(Model model) {
        // 1. 로그인 정보 확인
        // 2. 태그 목록 검색 후 주입
        // 3. 받아온 데이터 JSON으로 만들기
        // 4. return
        return "index";
    }

    @GetMapping(value = "/index")
    public String indexRedirectPage() {
        return "redirect:/";
    }
}
