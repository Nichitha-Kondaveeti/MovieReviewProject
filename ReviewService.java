package com.hcltech.moviereview.service;

import com.hcltech.moviereview.dto.GenreDTO;
import com.hcltech.moviereview.dto.ReviewDTO;
import com.hcltech.moviereview.model.Genre;
import com.hcltech.moviereview.model.Review;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ReviewService {

    public Set<Review> toEntity(Set<ReviewDTO> genreDTOS){
        final Set<Review> result = genreDTOS.stream()
                .map(genreDTO -> toEntity(genreDTO))
                .collect(Collectors.toSet());


        return result;
    }

    public Review toEntity(ReviewDTO reviewDTO){
        Review result = new Review();
        result.setId(reviewDTO.getId());
        result.setAuthor(reviewDTO.getAuthor());
        result.setContent(reviewDTO.getContent());
        result.setTitle(reviewDTO.getTitle());
        result.setCreatedAt(reviewDTO.getCreatedAt());
        result.setUpdatedAt(reviewDTO.getUpdatedAt());

        return result;
    }

    public Set<ReviewDTO> toDto(Set<Review>genres){
        final Set<ReviewDTO> result = genres.stream()
                .map(genre -> toDto(genre))
                .collect(Collectors.toSet());

        return result;
    }

    public ReviewDTO toDto (Review  review){
        ReviewDTO result= new ReviewDTO();
        result.setId(review.getId());
        result.setAuthor(review.getAuthor());
        result.setContent(review.getContent());
        result.setTitle(review.getTitle());
        result.setCreatedAt(review.getCreatedAt());
        result.setUpdatedAt(review.getUpdatedAt());

        return result;
    }





}
