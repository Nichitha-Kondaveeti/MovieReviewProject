package com.hcltech.moviereview.model;
//import java.util.Set;
import jakarta.persistence.*;

@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name", nullable = false, length = 30)
    private String name;

//    @ManyToOne
//    @JoinColumn(name = "movie_id",referencedColumnName = "id")
//    private Movie movie;

//    public Movie getMovie() {
//        return movie;
//    }
//
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }

    public Genre() {
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}