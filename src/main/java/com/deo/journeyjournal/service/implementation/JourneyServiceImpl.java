package com.deo.journeyjournal.service.implementation;

import com.deo.journeyjournal.dto.JourneyDto;
import com.deo.journeyjournal.service.JourneyService;
import org.springframework.stereotype.Service;

@Service
public class JourneyServiceImpl implements JourneyService {
  @Override
  public JourneyDto createJourney(JourneyDto journey) {
    return new JourneyDto("test");
  }

  @Override
  public JourneyDto findJourneyById(int id) {
    return new JourneyDto("test by id");
  }
}
