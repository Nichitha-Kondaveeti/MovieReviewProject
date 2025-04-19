package com.hcltech.moviereview.dto;

import java.util.Set;

public class MovieDTO {
    private int id;
    private String status;
    private String tagline;
    private String overview;
    private double revenue;
    private String title;
    private Set<ActorDTO> actors;
    private Set<GenreDTO> genres;
    private Set<ReviewDTO> reviews;


//    private Set<ActorDTO> actorDTOS;
//
//    private Set<ReviewDTO> reviewDTOS;
//    private Set<GenreDTO>genreDTOS;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<ActorDTO> getActors() {
        return actors;
    }

    public void setActors(Set<ActorDTO> actors) {
        this.actors = actors;
    }

    public Set<GenreDTO> getGenres() {
        return genres;
    }

    public void setGenres(Set<GenreDTO> genres) {
        this.genres = genres;
    }

    public Set<ReviewDTO> getReviews() {
        return reviews;
    }

    public void setReviews(Set<ReviewDTO> reviews) {
        this.reviews = reviews;
    }

//    public Set<ActorDTO> getActorDTOS() {
//        return actorDTOS;
//    }
//
//    public void setActorDTOS(Set<ActorDTO> actorDTOS) {
//        this.actorDTOS = actorDTOS;
//    }
//
//    public Set<ReviewDTO> getReviewDTOS() {
//        return reviewDTOS;
//    }
//
//    public void setReviewDTOS(Set<ReviewDTO> reviewDTOS) {
//        this.reviewDTOS = reviewDTOS;
//    }
//
//    public Set<GenreDTO> getGenreDTOS() {
//        return genreDTOS;
//    }
//
//    public void setGenreDTOS(Set<GenreDTO> genreDTOS) {
//        this.genreDTOS = genreDTOS;
//    }
}
