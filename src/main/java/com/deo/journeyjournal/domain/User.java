package com.deo.journeyjournal.domain;

import java.util.List;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "users")
public class User {
  @Id long id;
  String firsName;
  String lastName;
  String email;
  List<Journey> journeyList;
}
