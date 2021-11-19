package com.proj.youtuberandomplaylist.controller;

import com.proj.youtuberandomplaylist.model.Comment;
import com.proj.youtuberandomplaylist.model.UserPlaylistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class RandomPlaylistController {
    private final UserPlaylistRepository userPlaylistRepository;

    @GetMapping("/randomplaylist")
    public String randomPlayVideoPage(Model model){
        // 랜덤한 영상을 재생해주기 위한 메소드
        // 1. 무작위 태그 목록 5개 가져와서 출력하기
        List<String> tags = getFiveTag();

        // 2. 태그 목록 Thymeleaf에서 사용가능하도록 만들기
        model.addAttribute("tags", tags);

        // 3. return
        return "randomplaylist";
    }
    
    @GetMapping("randomplaylist/{playlistId}")
    public String randomPlaylistPage(@PathVariable String playlistId, Model model){
        // 재생목록을 재생하기 위한 메소드
        // 1. 무작위 태그 목록 5개 가져와서 출력하기
        List<String> tags = getFiveTag();
        
        // 2. 좋아요 목록 3개까지 받아오고 나머지는 숫자로 받아오기
        List<String> likes = getLikeList();
        String[] likeUsers = new String[3];
        for(int i = 0; i < likes.size() && i < likeUsers.length; i++){
            likeUsers[i] = likes.get(i);
        }
        int likeCntOtherUser = 0;
        if(likes.size() > likeUsers.length){
            likeCntOtherUser = likes.size() - likeUsers.length;
        }
        
        // 3. 댓글 목록 받아오기
        List<Comment> comments = getCommentList("targetPlaylistId");
        
        // 4. 로그인정보 확인하기
        // 5. 로그인중이면 내가 좋아요중인지 데이터 판별해서 보내주기

        /* this is psudo-code
        boolean isLike = false;

        if(isLogin){
            if(AmILike){
                isLike = true;
            }
        }
         */

        // 6. 받아온 데이터 Thymeleaf에서 사용가능하도록 만들기
        model.addAttribute("tags", tags);
        model.addAttribute("likeUsers", likeUsers);
        model.addAttribute("likeCnt", likeCntOtherUser);
        model.addAttribute("comments", comments);

        // 7. return
        return "randomplaylist";
    }
    
    public List<String> getFiveTag(){
        // 무작위 태그 목록 5개 가져와서 출력하기
        List<String> tags = new ArrayList<>();
        
        return tags;
    }
    
    public List<String> getLikeList(){
        // 좋아요 목록 가져오기
        List<String> likes = new ArrayList<>();
        
        return likes;
    }
    
    public List<Comment> getCommentList(String playlistId){
        // 댓글 목록 가져오기
        List<Comment> comments = new ArrayList<>();
        
        return comments;
    }
}
