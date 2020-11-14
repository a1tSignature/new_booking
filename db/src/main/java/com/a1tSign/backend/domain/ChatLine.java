package com.a1tSign.backend.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "chat_lines")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ChatLine {

  @Id
  @GeneratedValue
  @Column(name = "line_id")
  private long id;

  @Column(name = "message")
  private String message;

  @Column(name = "sent_at")
  private Date sentAt;

  @ManyToOne
  @JoinColumn(name = "chat_id")
  private MessageModel messageModel;

}
