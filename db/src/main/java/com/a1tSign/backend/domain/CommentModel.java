package com.a1tSign.backend.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CommentModel {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private long id;

  @Column(name = "hotel_id")
  long hotelId;

  @Column(name = "title")
  String title;

  @Column(name = "created_by")
  String createdBy;

  @Column(name = "text")
  String text;

  @Column(name = "created_at")
  Date createdAt;

  @Column(name = "rating")
  int rating;
}
