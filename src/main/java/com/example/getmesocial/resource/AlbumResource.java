package com.example.getmesocial.resource;

import com.example.getmesocial.model.Album;
import com.example.getmesocial.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/album")
    public Album getAlbum() {
        return albumService.getAlbum();
    }

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album){

        return albumService.saveAlbum(album);
    }

    @GetMapping("/allAlbums")
    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }

    @GetMapping("/album/{albumID}")
    public Album getAlbumByID(@PathVariable("albumID") int albumID) {
        return albumService.getAlbumByID(albumID);
    }

    @PutMapping("/album/{albumID}")
    public Album updateAlbum(@PathVariable("albumID") int albumID, @RequestBody Album album) {
        return albumService.updateAlbum(albumID, album);
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name = "albumID") int albumID) {
        return albumService.deleteAlbum(albumID);
    }

}
