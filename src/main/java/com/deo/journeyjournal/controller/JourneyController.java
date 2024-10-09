package com.deo.journeyjournal.controller;

import com.deo.journeyjournal.dto.JourneyDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/api/v1/journeys")
public interface JourneyController {
    @PostMapping
    Mono<JourneyDto> createJourney(JourneyDto journeyDto);

    @GetMapping
    Flux<JourneyDto> getAllJourneysFor(JourneyDto journeyDto);

}