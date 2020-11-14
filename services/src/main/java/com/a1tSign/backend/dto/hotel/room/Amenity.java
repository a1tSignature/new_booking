package com.a1tSign.backend.dto.hotel.room;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize
@ToString
@EqualsAndHashCode
public final class Amenity {

  private String name;
}
