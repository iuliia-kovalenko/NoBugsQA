package org.example.homework.clock;

public class Clock implements Readable {
    private int hours;
    private int seconds;
    private int minutes;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void tick() {
      seconds = seconds + 1;
        if(seconds > 59) {
            minutes = minutes + 1;
            seconds = seconds % 60;
        }
        if(minutes > 59) {
            hours = hours + 1;
            minutes = minutes % 60;
        }
        if(hours > 23){
            hours = hours % 24;
        }
    }

    @Override
    public void readTime() {
        System.out.println(hours + " hours "+  minutes + " minutes " + seconds + " seconds");
    }
}
