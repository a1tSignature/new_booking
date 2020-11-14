package com.a1tSign.backend.dto.hotel.room;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
@ToString
@EqualsAndHashCode
public final class Room {

  @JsonProperty ("id")
  private long id;

  @JsonProperty ("hotelId")
  private long hotelId;

  @JsonProperty("beds")
  private int beds;

  @JsonProperty("beds")
  private int dailyPrice;

  @JsonProperty("description")
  private String description;
}
