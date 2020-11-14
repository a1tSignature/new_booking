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
public final class BookedInfo {

  @JsonProperty ("hotelId")
  long hotelId;

  @JsonProperty("hotelName")
  String hotelName;

  @JsonProperty("roomId")
  long roomId;

  // replace properties on DateOfResidence

  @JsonProperty("arrivalDate")
  Date arrival;

  @JsonProperty("departureDate")
  Date departure;

  // end of replaceable props

  @JsonProperty("bedsCount")
  int beds;

  @JsonProperty("dailyPrice")
  int dailyPrice;

  @JsonProperty("description")
  String description;

}
