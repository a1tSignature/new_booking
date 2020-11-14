package com.a1tSign.backend.dto.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
@ToString
@EqualsAndHashCode
public final class Message {

  @JsonProperty("chatId")
  long chatId;

  @JsonProperty("sendBy")
  @Nullable
  String sentBy;

  @JsonProperty("message")
  @Length (min = 2, max = 100)
  @NotNull
  String message;

  @JsonProperty("sentAt")
  @Nullable
  Date sentAt;


}
