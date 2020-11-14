package com.a1tSign.backend.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.springframework.context.annotation.Role;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author a1tSign
 */

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@JsonDeserialize
@ToString
public final class UserModel {

  @JsonProperty("username")
  private final String username;
  @JsonProperty("password")
  // must set JsonView
  private final String password;
  @JsonProperty("balance")
  private final BigDecimal balance;

  //add list of orders and maybe list of addresses

  @JsonProperty("personalInfo")
  private final PersonalInfo personalInfo;

  @JsonProperty("createdAt")
  private final Date createdAt;
  @JsonProperty("isActive")
  private final boolean active;
  @JsonProperty("role")
  private Role role;

}
