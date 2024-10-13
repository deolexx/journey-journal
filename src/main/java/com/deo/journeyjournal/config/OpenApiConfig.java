package com.deo.journeyjournal.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info =
        @Info(
            title = "Journey-journal",
            version = "v1",
            description = "Journey-journal API",
            contact =
                @Contact(name = "Serhii Lukianenko", email = "s.lukianenko@andersenalab.com")),
    servers = {
      @Server(url = "http://localhost:8080", description = "Local Development Server"),
      @Server(url = "https://journey-journal.com", description = "Production Server (TBD)")
    })
public class OpenApiConfig {}
