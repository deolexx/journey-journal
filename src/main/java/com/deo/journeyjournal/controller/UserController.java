package com.deo.journeyjournal.controller;

import com.deo.journeyjournal.dto.UserDto;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@Tag(name = "User API")
@RequestMapping("/api/v1/user")
public interface UserController {

  Mono<UserDto> register();

  @ApiResponse(description = "Method to login")
  Mono<UserDto> login(String username, String password);
}
