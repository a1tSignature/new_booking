package com.a1tSign.backend.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "chats")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class MessageModel {

  @Id
  @GeneratedValue
  @Column(name = "chat_id")
  private long chatId;

  @OneToMany(mappedBy = "messageModel")
  Set<ChatLine> chatLines;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "tenant_id")
  private UserModelEntity tenant;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "landlord_id")
  private UserModelEntity landlord;
}
