package com.proj.youtuberandomplaylist.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Comment extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    // 댓글을 작성한 위치.
    // 재생목록 자체의 ID가 아닌 사용자가 업로드한 재생목록의 고유 ID를 담는 것입니다!
    @Column
    private Long userPlaylistId;

    // 댓글 작성자의 ID.
    @Column
    private String userId;

    // 댓글의 내용.
    @Column
    private String comment;

    public Comment(CommentDto commentDto){
        this.userPlaylistId = commentDto.getUserPlaylistId();
        this.userId = commentDto.getUserId();
        this.comment = commentDto.getComment();
    }
}
