package com.capstone.songs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongController {

    @Autowired
    TrackRepository trackRepository;

    @GetMapping("/songs")
    public List<Song> getSongs(){
        return trackRepository.getSongs();
    }
}
