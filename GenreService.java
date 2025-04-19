package com.hcltech.moviereview.service;

import com.hcltech.moviereview.dto.GenreDTO;
import com.hcltech.moviereview.model.Genre;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
@Service
public class GenreService {

    public Set<Genre> toEntity(Set<GenreDTO> genreDTOS){
        final Set<Genre> result = genreDTOS.stream()
                .map(genreDTO -> toEntity(genreDTO))
                .collect(Collectors.toSet());


        return result;
    }

    public Genre toEntity(GenreDTO genreDTO){
        Genre result = new Genre();
        result.setId(genreDTO.getId());
        result.setName(genreDTO.getName());
        //result.setMovie(genreDTO.getMovie());

        return result;
    }

    public Set<GenreDTO> toDto(Set<Genre>genres){
        final Set<GenreDTO> result = genres.stream()
                .map(genre -> toDto(genre))
                .collect(Collectors.toSet());

        return result;
    }

    public GenreDTO toDto (Genre  genre){
        GenreDTO result= new GenreDTO();
        result.setId(genre.getId());
        result.setName(genre.getName());
        //result.setMovie(genre.getMovie());

        return result;
    }


}
