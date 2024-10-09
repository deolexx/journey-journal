package com.deo.journeyjournal.controller.implementation;

import com.deo.journeyjournal.controller.JourneyController;
import com.deo.journeyjournal.dto.JourneyDto;
import com.deo.journeyjournal.service.JourneyService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Tag(name = "Journey API")
@RestController
@RequestMapping("api/v1/journeys")
public class JourneyControllerImpl implements JourneyController {

  private final JourneyService journeyService;

  @ApiResponse(description = "Method to create new Journey")
  @PostMapping
  public Mono<JourneyDto> createNewJourney() {
    return Mono.just(null);
  }

  @GetMapping
  Flux<JourneyDto> getAllJourneys() {
    return Flux.just(null);
  }
}
