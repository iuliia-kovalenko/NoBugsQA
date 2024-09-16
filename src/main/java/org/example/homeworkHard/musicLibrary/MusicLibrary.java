package org.example.homeworkHard.musicLibrary;

import java.util.HashMap;
import java.util.HashSet;

public class MusicLibrary {

    private HashMap<String, HashSet<MusicTrack>> musicLibrary;

    public MusicLibrary() {
        this.musicLibrary = new HashMap<>();
    }

    public void addTrack(MusicTrack musicTrack) {
        HashSet<MusicTrack> tracks = musicLibrary.get(musicTrack.getGenre());
        if (tracks == null) {
            tracks = new HashSet<>();
            musicLibrary.put(musicTrack.getGenre(), tracks);
        }
        tracks.add(musicTrack);
    }
    public void removeTrack(MusicTrack musicTrack) {
        HashSet<MusicTrack> tracks = musicLibrary.get(musicTrack.getGenre());
        if (tracks != null) {
            tracks.remove(musicTrack);
            if (tracks.isEmpty()) {
                musicLibrary.remove(musicTrack.getGenre());
            }
        }
    }

    public HashSet<MusicTrack> getTracksByGenre(String genre) {
        return musicLibrary.getOrDefault(genre, new HashSet<>());
    }


    public void printAllTracksByGenre(String genre) {
        HashSet<MusicTrack> tracks = getTracksByGenre(genre);
        if (tracks.isEmpty()) {
            System.out.println("No tracks found for genre: " + genre);
        } else {
            System.out.println("Tracks for genre: " + genre);
            for (MusicTrack track : tracks) {
                System.out.println(track);
            }
        }
    }


}
