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
        album.setAlbumID(albumList.size() + 1);
        albumList.add(album);
        return album;
    }

    public List<Album> getAllAlbums() {
        return albumList;
    }

    public Album getAlbumByID(int albumID) {
        for(Album album:albumList) {
            if(album.getAlbumID() == albumID){
                return album;
            }
        }
        return null;
    }

    public Album updateAlbum(int albumID, Album album) {
        for(Album a:albumList) {
            if(a.getAlbumID() == albumID) {
                a.setName(album.getName());
                a.setDescription(album.getDescription());
                a.setCoverPicUrl(album.getCoverPicUrl());
                return a;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumID) {
        Album deletedAlbum = null;
        for(Album a:albumList) {
            if(a.getAlbumID() == albumID) {
                deletedAlbum = a;
                albumList.remove(a);
                return deletedAlbum;
            }
        }
        return deletedAlbum;
    }
}
