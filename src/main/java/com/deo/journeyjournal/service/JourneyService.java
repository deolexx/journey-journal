package com.deo.journeyjournal.service;

import com.deo.journeyjournal.dto.Journey;

public interface JourneyService {

  Journey createJourney(Journey journey);

  Journey findJourneyById(int id);
}
