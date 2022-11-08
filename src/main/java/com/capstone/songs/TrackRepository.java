package com.capstone.songs;

import com.capstone.songs.Song;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TrackRepository {
    public List<Song> getSongs(){
        return List.of(
                new Song("1","Don't Let Me Be Lonely Tonight"),
                new Song("2","Let Me Let Go"),
                new Song("3","Perdu d'avance (par Gad Elmaleh)"),
                new Song("4","C'est beau de faire un Show"),
                new Song("5","Roses and guns")
        );
    }
}
