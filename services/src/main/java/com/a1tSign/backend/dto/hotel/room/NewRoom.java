package com.a1tSign.backend.dto.hotel.room;

import com.a1tSign.backend.validation.RoomValidationErrors;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
@ToString
@EqualsAndHashCode
public final class NewRoom {

  @JsonProperty ("hotelId")
  long hotelId;

  @JsonProperty("beds")
  @Min (value = 1, message = RoomValidationErrors.NUMBER_OF_BEDS_IS_INVALID)
  int beds;

  @JsonProperty("dailyPrice")
  @Min(value = 1, message = RoomValidationErrors.DAILY_PRICE_IS_INVALID)
  int dailyPrice;

  @JsonProperty("description")
  @Length(min = 30, max = 500, message = RoomValidationErrors.DESCRIPTION_IS_INVALID)
  String description;

}
