package com.proj.youtuberandomplaylist.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPlaylistRepository extends JpaRepository<UserPlaylist, Long> {
}
