package com.deo.journeyjournal.controller;

import com.deo.journeyjournal.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@RequestMapping("/api/v1/user")
public interface UserController {


    Mono<UserDto> register();

    Mono<UserDto> login(String username, String password);


}
