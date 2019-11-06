package com.rakovets.course.challenge.oop.classes;

public class TimeRange {
    private long sec;
    private long min;
    private long hour;

    TimeRange(long sec) {
        this.hour = sec / 3600;
        this.min = sec % 3600 / 60;
        this.sec = sec % 60;
    }

    TimeRange(long sec, long min, long hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    long convertTimeRangeToSeconds() {
        long seconds = this.hour * 3600 + this.min * 60 + this.sec;
        return seconds;
    }

    public long getHour() {
        return hour;
    }

    public long getMin() {
        return min;
    }

    public long getSec() {
        return sec;
    }

    void print() {
        System.out.println("Hours: " + this.hour + " Minutes: " + this.min + " Seconds: " + this.sec);
    }
}
