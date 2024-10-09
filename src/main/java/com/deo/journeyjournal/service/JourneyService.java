package com.deo.journeyjournal.service;

import com.deo.journeyjournal.dto.JourneyDto;

public interface JourneyService {

  JourneyDto createJourney(JourneyDto journey);

  JourneyDto findJourneyById(int id);
}
