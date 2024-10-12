package com.deo.journeyjournal.controller;

import com.deo.journeyjournal.dto.JourneyDto;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Tag(name = "Journey API")
@RequestMapping("/api/v1/journeys")
public interface JourneyController {

  @ApiResponse(description = "Method to create new Journey")
  @PostMapping
  Mono<JourneyDto> createJourney(JourneyDto journeyDto);

  @GetMapping
  Flux<JourneyDto> getAllJourneysFor(JourneyDto journeyDto);
}
