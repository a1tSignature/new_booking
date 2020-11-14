package com.a1tSign.backend.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "rooms")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class RoomModel {

  @Id
  @GeneratedValue
  @Column(name = "room_id")
  private long id;

  @ManyToOne
  @JoinColumn(name = "hotel_id")
  private HotelModel hotel;

  @OneToMany(mappedBy = "bookedRoom")
  private Set<BookedRoomModel> bookedRooms;

  @Column(name = "beds")
  private int beds;

  @Column(name = "daily_price")
  private int dailyPrice;

  @Column(name = "description")
  private String description;
}
