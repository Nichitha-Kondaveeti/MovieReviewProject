package com.hcltech.moviereview.service;

import com.hcltech.moviereview.dto.ActorDTO;
import com.hcltech.moviereview.dto.GenreDTO;
import com.hcltech.moviereview.dto.MovieDTO;
import com.hcltech.moviereview.dto.ReviewDTO;
import com.hcltech.moviereview.model.Genre;
import com.hcltech.moviereview.model.Movie;
import com.hcltech.moviereview.model.Review;
import com.hcltech.moviereview.model.Actor;
import com.hcltech.moviereview.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MovieService {
    @Autowired
    private  ActorService actorService;
    @Autowired
    private  GenreService genreService;
    @Autowired
    private ReviewService reviewService;


    @Autowired
    private  MovieRepository movieRepository;

    public List<MovieDTO> getAll(){
        final List<Movie> movies= movieRepository.findAll();
        return toDto(movies);
    }

    public MovieDTO getOneById(int id){
        final Movie movie= movieRepository.findById(id)
                .orElse(null);
        return toDto(movie);
    }

    public MovieDTO create(MovieDTO movieDTO){
        final Movie movie= toEntity(movieDTO);
        final Movie savedMovie=movieRepository.save(movie);
        return toDto (savedMovie);
    }


    public MovieDTO update(MovieDTO movieDTO){
        final Movie movie= toEntity(movieDTO);
        final Movie updatedMovie=movieRepository.save(movie);
        return toDto (updatedMovie);
    }



    public void delete(int id){
        movieRepository.deleteById(id);
    }

//--------------------------------------------------------- --------------------------------------------------------------------------------------
//--------------------------------------------------------- --------------------------------------------------------------------------------------
    private List<MovieDTO> toDto(List<Movie> movies){
        return movies.stream()
                .map((movie -> toDto(movie)))
                .collect(Collectors.toList());
    }
    private MovieDTO toDto(Movie movie){
        MovieDTO movieDTO= new MovieDTO();
        movieDTO.setId(movie.getId());
        movieDTO.setStatus(movie.getStatus());
        movieDTO.setTagline(movie.getTagline());
        movieDTO.setOverview(movie.getOverview());
        movieDTO.setRevenue(movie.getRevenue());
        movieDTO.setTitle(movie.getTitle());

        final Set<Actor>actors=movie.getActors();
        final Set<ActorDTO>actorDTOS= actorService.toDto(actors);
        movieDTO.setActors(actorDTOS);

        final Set<Review>reviews=movie.getReviews();
        final Set<ReviewDTO>reviewDTOS=reviewService.toDto(reviews);
        movieDTO.setReviews(reviewDTOS);

        final Set<Genre>genres=movie.getGenres();
        final Set<GenreDTO>genreDTOS=genreService.toDto(genres);
        movieDTO.setGenres(genreDTOS);

        return movieDTO;

    }

    private List<Movie> toEntity(List<MovieDTO> movieDTOS){
        return movieDTOS.stream()
                .map((movieDTO -> toEntity(movieDTO)))
                .collect(Collectors.toList());
    }

    private Movie toEntity(MovieDTO movieDTO){
        Movie movie= new Movie();

        movie.setId(movieDTO.getId());
        movie.setStatus(movieDTO.getStatus());
        movie.setTagline(movieDTO.getTagline());
        movie.setOverview(movieDTO.getOverview());
        movie.setRevenue(movieDTO.getRevenue());
        movie.setTitle(movieDTO.getTitle());


        final Set<ActorDTO>actorDTOS= movieDTO.getActors();
        final Set<Actor>actors= actorService.toEntity(actorDTOS);
        movie.setActors(actors);
        //actors.forEach((actor -> actor.setMovie(movie)));

        final Set<ReviewDTO>reviewDTOS= movieDTO.getReviews();
        final Set<Review>reviews= reviewService.toEntity(reviewDTOS);
        movie.setReviews(reviews);
        //reviews.forEach((review -> review.setMovie(movie)));



        final Set<GenreDTO>genreDTOS= movieDTO.getGenres();
        final Set<Genre>genres= genreService.toEntity(genreDTOS);
        movie.setGenres(genres);
        //genres.forEach((genre -> genre.setMovie(movie)));

        return movie;

    }





    }