package com.a1tSign.backend.dto.hotel.room;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize
@ToString
@EqualsAndHashCode
public final class DateOfResidence {

  @JsonProperty("arrivalDate")
  Date arrivalDate;

  @JsonProperty("departureDate")
  Date departureDate;
}
