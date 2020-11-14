package com.a1tSign.backend.domain;

import com.a1tSign.backend.domain.nonEntity.BookedRoomPK;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booked_rooms")
@IdClass(BookedRoomPK.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BookedRoomModel {

  @Id
  @AttributeOverrides ({
    @AttributeOverride(name = "userLogin",
      column = @Column(name="user_login")),
    @AttributeOverride(name = "arrival",
      column = @Column(name="arrival"))
  })
  private String userLogin;
  private Date arrival;

  private Date departure;

  @ManyToOne
  @JoinColumn(name = "room_id")
  private RoomModel bookedRoom;
}
