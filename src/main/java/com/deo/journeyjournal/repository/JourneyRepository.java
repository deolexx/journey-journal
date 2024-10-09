package com.deo.journeyjournal.repository;

import com.deo.journeyjournal.domain.Journey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface JourneyRepository extends ReactiveCrudRepository<Journey, Long> {}
