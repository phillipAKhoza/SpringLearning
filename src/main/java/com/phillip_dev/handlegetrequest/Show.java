package com.phillip_dev.handlegetrequest;

public class Show {

    private String title;
    private String episode;
    private Double rating;



    public Show(String title, String episode, Double rating) {
        this.title = title;
        this.episode = episode;
        this.rating = rating;
    }

    public Show() {
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisode() {
        return this.episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public Double getRating() {
        return this.rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    
}
