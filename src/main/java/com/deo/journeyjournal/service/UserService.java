package com.deo.journeyjournal.service;

import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import reactor.core.publisher.Mono;

public interface UserService {

  String create(String token);

  Mono<String> checkOrCreateNewUser(OidcUser user);
}
