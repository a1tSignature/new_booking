package com.a1tSign.backend.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "hotels")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class HotelModel {
  @Id
  @GeneratedValue
  @Column (name = "hotel_id")
  private long id;

  @Column (name = "name")
  private String name;

  @Column (name = "city")
  private String city;

  @Column (name = "street")
  private String street;

  @Column (name = "house")
  private String house;

  @Column (name = "description")
  private String description;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "hotel_amenities",
    joinColumns = @JoinColumn(name = "hotel_id"),
    inverseJoinColumns = @JoinColumn(name = "amenity_id")
  )
  private Set<AmenityModel> amenities;

  @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
  private Set<RoomModel> rooms;

  @Column (name = "created_at")
  private Date createdAt;
}
