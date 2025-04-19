package com.hcltech.moviereview.dto;
import com.hcltech.moviereview.model.Movie;

public class GenreDTO {

    private int  id;
    private String name;
    //private Movie movie;

//    public Movie getMovie() {
//        return movie;
//    }
//
//    public void setMovie(Movie movie) {
//        this.movie = this.movie;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}