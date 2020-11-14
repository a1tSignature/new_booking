package com.a1tSign.backend;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ChatModel {

  private long chatId;

  private long tenantId;
  private long landlordId;

}
