package com.a1tSign.backend.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class AmenityModel {

  @Id
  @GeneratedValue
  private long id;

  @ManyToMany(mappedBy = "amenities")
  private List<HotelModel> hotelModel;

  @Column (name = "name")
  private String name;

}
