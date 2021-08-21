package com.example.getmesocial.resource;

import com.example.getmesocial.model.Album;
import com.example.getmesocial.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/user")
    public Album getAlbum() {
        return albumService.getAlbum();
    }

    @PostMapping("/user")
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

}