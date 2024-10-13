package com.deo.journeyjournal.controller.implementation;

import com.deo.journeyjournal.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserControllerImpl {

  private final UserService userService;

  @GetMapping(value = "/login", produces = "application/json")
  public Mono<Void> register(ServerWebExchange exchange, @AuthenticationPrincipal OidcUser user) {
    String idToken = user.getIdToken().getTokenValue();
    exchange.getResponse().getHeaders().add("idToken", idToken);
    Mono<String> userInfo = userService.checkOrCreateNewUser(user);
    return userInfo.flatMap(
        info -> {
          DataBuffer dataBuffer = exchange.getResponse().bufferFactory().wrap(info.getBytes());

          return exchange.getResponse().writeWith(Mono.just(dataBuffer));
        });
  }
}
