package com.hcltech.moviereview.controller;

import com.hcltech.moviereview.dto.MovieDTO;
import com.hcltech.moviereview.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private  MovieService movieService;

    @GetMapping("/movies")
    public List<MovieDTO> getAll(){
        return movieService.getAll();
    }

    @GetMapping("/movies/{id}")
    public MovieDTO getOneById(@PathVariable int id){
        return movieService.getOneById(id);
    }

    @PostMapping("/movies")
    public MovieDTO create (@RequestBody MovieDTO movieDTO){
        return movieService.create(movieDTO);
    }

    @PutMapping("/movies")
    public MovieDTO update (@RequestBody MovieDTO movieDTO){
        return movieService.update(movieDTO);
    }

    @DeleteMapping("/movies/{id}")
    public void delete(@PathVariable int id){
        movieService.delete(id);
    }

}
