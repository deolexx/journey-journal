package com.deo.journeyjournal.controller.implementation;

import com.deo.journeyjournal.controller.JourneyController;
import com.deo.journeyjournal.dto.JourneyDto;
import com.deo.journeyjournal.service.JourneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
public class JourneyControllerImpl implements JourneyController {

  private final JourneyService journeyService;

  @Override
  public Mono<JourneyDto> createJourney(JourneyDto journeyDto) {
    return null;
  }

  @Override
  public Flux<JourneyDto> getAllJourneysFor(JourneyDto journeyDto) {
    return null;
  }
}
