package com.deo.journeyjournal.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Data
public class User {
  @Id long id;
  String fullName;
  String email;
  //  List<Journey> journeyList;
}
