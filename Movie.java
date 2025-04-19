package com.hcltech.moviereview.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "status", length = 30)
    private String status;
    @Column(name = "tagline")
    private String tagline;
    @Column(name = "overview")
    private String overview;
    @Column(name = "revenue")
    private double revenue;
    @Column(name = "title")
    private String title;


    @OneToMany
    private Set<Genre> genres;
    @OneToMany
    private Set<Review> reviews;
    @OneToMany
    private Set<Actor> actors;

//    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
//    private Set<Review> reviews;
//
//    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
//    private Set<Actor> actors;
//
//    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
//    private Set<Genre> genres;

    public Movie() {
    }

    public Movie(int id, String status, String tagline, String overview, double revenue, String title, Set<Review> reviews, Set<Actor> actors, Set<Genre> genres) {
        this.id = id;
        this.status = status;
        this.tagline = tagline;
        this.overview = overview;
        this.revenue = revenue;
        this.title = title;
        this.reviews = reviews;
        this.actors = actors;
        this.genres = genres;
    }


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

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", tagline='" + tagline + '\'' +
                ", overview='" + overview + '\'' +
                ", revenue=" + revenue +
                ", title='" + title + '\'' +
                ", reviews=" + reviews +
                ", actors=" + actors +
                ", genres=" + genres +
                '}';
    }
}