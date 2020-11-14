package com.a1tSign.backend.domain.nonEntity;

import lombok.*;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BookedInfoModel {

  long hotelId;

  String hotelName;
  long roomId;

  Date arrival;
  Date departure;

  int beds;
  int dailyPrice;

  String description;

}
