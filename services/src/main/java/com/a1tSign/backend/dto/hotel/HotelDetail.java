package com.a1tSign.backend.dto.hotel;

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
public final class HotelDetail {

  @JsonProperty("hotel")
  private Hotel hotel;

  @JsonProperty("createdBy")
  private String creatorName;

  @JsonProperty("creatorId")
  private long creatorId;
}
