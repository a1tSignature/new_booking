package com.a1tSign.backend.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "hotel_images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class HotelImage {

  @Id
  @Column(name = "image")
  private String image;

  @OneToOne
  @JoinColumn(name = "hotel_id")
  private HotelModel hotelModel;
}
