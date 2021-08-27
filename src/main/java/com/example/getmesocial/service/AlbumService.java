package com.example.getmesocial.service;

import com.example.getmesocial.model.Album;
import com.example.getmesocial.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album getAlbum() {
        return albumRepository.getAlbum();

    }

    public Album saveAlbum(Album album) {

        return albumRepository.saveAlbum(album);
    }

    public List<Album> getAllAlbums() {
        return albumRepository.getAllAlbums();
    }

    public Album getAlbumByID(int albumID) {
        return albumRepository.getAlbumByID(albumID);
    }

    public Album updateAlbum(int albumID, Album album) {
        return albumRepository.updateAlbum(albumID, album);
    }

    public Album deleteAlbum(int albumID) {
        return albumRepository.deleteAlbum(albumID);
    }
}
