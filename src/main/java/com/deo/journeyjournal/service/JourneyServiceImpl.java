package com.deo.journeyjournal.service;

import com.deo.journeyjournal.dto.Journey;
import org.springframework.stereotype.Service;

@Service
public class JourneyServiceImpl implements JourneyService {
  @Override
  public Journey createJourney(Journey journey) {
    return new Journey("test");
  }

  @Override
  public Journey findJourneyById(int id) {
    return new Journey("test by id");
  }
}
