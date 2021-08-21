package com.example.getmesocial.repository;

import com.example.getmesocial.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {

    List<Album> albumList = new ArrayList();
    public Album getAlbum() {
        Album album = new Album(1,"Michal", "1980 Hits","michal jackson.com");
        return album;
    }

    public Album saveAlbum(Album album) {
        albumList.add(album);
        return album;
    }
}
