package com.deo.journeyjournal.controller;

import com.deo.journeyjournal.dto.Journey;
import com.deo.journeyjournal.service.JourneyService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.time.Duration;
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
public class JourneyController {

  private final JourneyService journeyService;

  @ApiResponse(description = "Method to create new Journey")
  @PostMapping
  public Mono<Journey> createNewJourney() {
    return Mono.create(journeyMonoSink -> journeyMonoSink.success(new Journey("tsts1")));
  }

  @GetMapping
  Flux<Journey> getAllJourneys() {
    return Flux.just(new Journey("tsts1"), new Journey("tsts2"), new Journey("tsts3"))
        .delayElements(Duration.ofSeconds(3))
        .log();
  }
}
