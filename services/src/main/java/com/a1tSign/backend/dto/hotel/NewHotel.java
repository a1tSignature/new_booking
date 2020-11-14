package com.a1tSign.backend.dto.hotel;

import com.a1tSign.backend.dto.Location;
import com.a1tSign.backend.dto.hotel.room.Amenity;
import com.a1tSign.backend.validation.HotelValidationErrors;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
@ToString
@EqualsAndHashCode
public final class NewHotel {

  @Length (min = 4)
  @JsonProperty ("name")
  String name;

  @NotNull (message = HotelValidationErrors.LOCATION_DESCRIPTION_IS_INVALID)
  @JsonProperty ("location")
  Location location;

  @Length (min = 50)
  @JsonProperty ("description")
  String description;

  @Size (min = 3, message = HotelValidationErrors.AMENITIES_SIZE_IS_INVALID)
  @JsonProperty ("amenities")
  Set<Amenity> amenities;
}
