package com.hcltech.moviereview.service;

import com.hcltech.moviereview.dto.ActorDTO;
import com.hcltech.moviereview.model.Actor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ActorService {

    public Set<Actor> toEntity(Set<ActorDTO> actorDTOS){
        final Set<Actor> result = actorDTOS.stream()
                .map(addressDto -> toEntity(addressDto))
                .collect(Collectors.toSet());

        return result;
    }



    public Actor toEntity(ActorDTO actorDTO){

        Actor result = new Actor();
        result.setId(actorDTO.getId());
        result.setPopularity(actorDTO.getPopularity());
        result.setGender(actorDTO.getGender());
        result.setName(actorDTO.getName());

        return result;
    }



    public Set<ActorDTO> toDto(Set<Actor> actors){
        final Set<ActorDTO> result = actors.stream()
                .map(actor -> toDto(actor))
                .collect(Collectors.toSet());

        return result;
    }



    public ActorDTO toDto(Actor actor){

        ActorDTO result = new ActorDTO();
        result.setId(actor.getId());
        result.setPopularity(actor.getPopularity());
        result.setGender(actor.getGender());
        result.setName(actor.getName());


        return result;
    }





}
