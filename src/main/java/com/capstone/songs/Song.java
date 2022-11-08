package com.capstone.songs;



public class Song {
    private String id;
    private String trackName;

    public Song(String id, String trackName) {
        this.id = id;
        this.trackName = trackName;
    }

    public String getId() {
        return id;
    }

    public String getTrackName() {
        return trackName;
    }
}
