package com.a1tSign.backend.dto.comment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize
@ToString
@EqualsAndHashCode
public final class Comment {

  @JsonProperty("id")
  long id;

  @JsonProperty("hotelId")
  long hotelId;

  @JsonProperty("title")
  @Length (min = 5, max = 30)
  @NotNull
  String title;

  @JsonProperty("createdBy")
  @Nullable
  String createdBy;

  @JsonProperty("text")
  @Length(min = 30, max = 200)
  @NotNull
  String text;

  @JsonProperty("createdAt")
  @Nullable
  Date createdAt;

  @JsonProperty("rating")
  int rating;
}
