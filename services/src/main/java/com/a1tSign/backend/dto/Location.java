package com.a1tSign.backend.dto;

import com.a1tSign.backend.validation.UserValidationErrors;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public final class Location {

  @Length (min = 1,
    max = 50,
    message = UserValidationErrors.LOCATION_DESCRIPTION_IS_INVALID)
  String country;
  @Length(min = 1,
    max = 50,
    message = UserValidationErrors.LOCATION_DESCRIPTION_IS_INVALID)
  String city;
  @Length(min = 1,
    max = 50,
    message = UserValidationErrors.LOCATION_DESCRIPTION_IS_INVALID)
  String street;
  @Length(min = 1,
    max = 5,
    message = UserValidationErrors.LOCATION_DESCRIPTION_IS_INVALID)
  String house;
}
