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
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@JsonDeserialize
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public final class Hotel {

  @JsonProperty ("id")
  private long id;

  @JsonProperty ("name")
  @Length (min = 4)
  private String name;

  @JsonProperty ("location")
  @NotNull (message = HotelValidationErrors.AMENITIES_SIZE_IS_INVALID)
  private Location location;

  @JsonProperty ("description")
  @Length (min = 50)
  private String description;

  @JsonProperty ("amenities")
  @Size (min = 3, message = HotelValidationErrors.AMENITIES_SIZE_IS_INVALID)
  private Set<Amenity> amenities;

  @JsonProperty ("createdAt")
  private Date createdAt;

}
