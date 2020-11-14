package com.a1tSign.backend.domain;

import com.a1tSign.backend.Role;
import lombok.*;


import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table (name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode (exclude = {"firstName", "lastName", "password",
  "createdAt", "active", "locked",
  "email", "phone", "country",
  "city", "street", "house"})
public class UserModelEntity {

  @Id
  @GeneratedValue
  private long id;

  @Column (name = "first_name")
  private String firstName;

  @Column (name = "last_name")
  private String lastName;

  @Column (name = "email")
  private String email;

  @Column (name = "phone")
  private String phone;

  @Column (name = "is_active")
  private boolean active;

  @Column (name = "locked")
  private boolean locked;

  @Column (name = "username")
  private String username;

  @Column (name = "password")
  private String password;

  @Column (name = "created_at")
  private Instant createdAt;

  @Column (name = "role")
  @Enumerated(EnumType.STRING)
  private Role role;

  @Column (name = "country")
  private String country;

  @Column (name = "city")
  private String city;

  @Column (name = "street")
  private String street;

  @Column (name = "house")
  private String house;

  @OneToMany
  @JoinTable(name = "hotels_created_by",
  joinColumns = {@JoinColumn(name = "hotel_id")},
  inverseJoinColumns = {@JoinColumn(name = "user_id")})
  private List<HotelModel> hotels;

}
