package com.a1tSign.backend.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

import static com.a1tSign.backend.validation.UserValidationErrors.*;

@Getter
@Setter
@EqualsAndHashCode
public final class PersonalInfo {

  private PersonalInfo(
    @Nullable String firstName,
    @Nullable String lastName,
    String email,
    String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
    this.fullName = Objects.requireNonNull(getFullName(), "fullName");
  }

  @JsonProperty ("firstName")
  @Length(
    min = 1,
    max = 50,
    message = FIRST_NAME_LENGTH_IS_INVALID
  )
  private final @NotNull String firstName;

  @JsonProperty ("lastName")
  @Length (
    min = 1,
    max = 50,
    message = LAST_NAME_LENGTH_IS_INVALID
  )
  private final @NotNull String lastName;

  @JsonProperty ("fullName")
  private transient final String fullName;

  @JsonProperty ("email")
  @Pattern (regexp = "[a-zA-Z\\d-_.]+@[a-zA-Z\\d-_.]{3,}", message = EMAIL_HAS_INVALID_FORMAT)
  private final String email;

  @JsonProperty ("phone")
  @Pattern(regexp = "\\d{5,15}", message = PHONE_FORMAT_IS_INVALID)
  private final String phone;


  private String getFullName() {
    if (
      (getFirstName() == null || getFirstName().isBlank())
        && (getLastName() == null || getLastName().trim().isEmpty())
    ) {
      return "";
    }

    if (getFirstName() == null) {
      return Objects.requireNonNull(getLastName()).strip();
    }

    if (getLastName() == null) {
      return getFirstName().strip();
    }

    return (getFirstName() + " " + getLastName()).strip();
  }


}
