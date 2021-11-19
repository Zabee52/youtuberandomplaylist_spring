package com.proj.youtuberandomplaylist.model;

import lombok.Getter;

@Getter
public class CommentDto {
    private Long userPlaylistId;
    private String userId;
    private String comment;
}
