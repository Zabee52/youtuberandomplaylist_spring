package com.proj.youtuberandomplaylist.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class UserPlaylist extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column
    private String playlistId;

    @Column
    private String author;

    public UserPlaylist(UserPlaylistDto userPlaylistDto){
        this.playlistId = userPlaylistDto.getPlaylistId();
        this.author = userPlaylistDto.getAuthor();
    }
}
