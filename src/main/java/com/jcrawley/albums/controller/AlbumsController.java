package com.jcrawley.albums.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcrawley.albums.model.Album;

@RestController
@RequestMapping("/albums")
public class AlbumsController {
    
    @GetMapping
    public List<Album> getAlbums() { 
        
        Album album1 = Album.builder()
        		.id("1")
        		.userId("1")
        		.title("Album 1 title")
        		.description("Album 1 description")
        		.url("")
        		.build();
        
        Album album2 = Album.builder()
        		.id("2")
        		.userId("1")
        		.title("Album 2 title")
        		.description("Album 2 description")
        		.url("")
        		.build();
        
                
        return Arrays.asList(album1, album2);
    }
 
}
