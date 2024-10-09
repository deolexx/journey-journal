package com.deo.journeyjournal.repository;

import com.deo.journeyjournal.domain.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {}
