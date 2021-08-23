package com.example.getmesocial.service;

import com.example.getmesocial.model.Album;
import com.example.getmesocial.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
}
