package com.deo.journeyjournal.controller.implementation;

import com.deo.journeyjournal.controller.UserController;
import com.deo.journeyjournal.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
public class UserControllerImpl implements UserController {
  @Override
  public Mono<UserDto> register() {
    return null;
  }

  @Override
  public Mono<UserDto> login(String username, String password) {
    return null;
  }
}
