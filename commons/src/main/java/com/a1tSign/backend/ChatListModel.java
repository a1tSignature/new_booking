package com.a1tSign.backend;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ChatListModel {

  private long chatId;

  private String partnerName;
  private String lastMessage;
}
