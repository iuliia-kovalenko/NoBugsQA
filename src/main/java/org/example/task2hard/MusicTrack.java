package org.example.task2hard;

public class MusicTrack {
    String track;
    String singer;
    String genre;

    public MusicTrack(String track, String singer, String genre) {
        this.track = track;
        this.singer = singer;
        this.genre = genre;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String toString() {
        return "MusicTrack{" +
                "title='" + track + '\'' +
                ", artist='" + singer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
