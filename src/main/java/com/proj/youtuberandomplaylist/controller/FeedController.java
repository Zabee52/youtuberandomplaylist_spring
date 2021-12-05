package com.proj.youtuberandomplaylist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedController {
    @GetMapping("/feed")
    public String feed(){
        // 1. 로그인 상태가 아닐 경우 index 화면으로 redirect <- WebSecurity로 적용
        // 2. 내가 추가한 태그 목록 받아오기
        // 3. 내가 만든 플레이리스트 받아오기
        // 4. 내가 좋아요한 플레이리스트 받아오기
        // 5. 다른 사람들이 만든 플레이리스트 랜덤하게 가져오기
        // 6. 받아온 데이터 JSON으로 만들기
        // 7. return
        return "feed";
    }
}
