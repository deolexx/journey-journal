package com.deo.journeyjournal;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class JourneyJournalApplication {

  public static void main(String[] args) {

    SpringApplication.run(JourneyJournalApplication.class, args);
  }
}
