package com.deo.journeyjournal.service.implementation;

import com.deo.journeyjournal.domain.User;
import com.deo.journeyjournal.repository.UserRepository;
import com.deo.journeyjournal.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  public String create(String token) {
    return token;
  }

  @Override
  public Mono<String> checkOrCreateNewUser(OidcUser user) {
    return userRepository
        .findUserByEmail(user.getEmail())
        .flatMap(existingUser -> Mono.just(existingUser.getFullName()))
        .switchIfEmpty(
            Mono.defer(
                () -> {
                  User newUser = new User();
                  newUser.setEmail(user.getEmail());
                  newUser.setFullName(user.getFullName());
                  return userRepository.save(newUser).map(User::getFullName);
                }));
  }
}
