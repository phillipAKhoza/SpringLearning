package com.phillip_dev.markssubmittionproj;

public class Mark {
    private String name;
    private String subject;
    private int score;


    public Mark(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public Mark() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}