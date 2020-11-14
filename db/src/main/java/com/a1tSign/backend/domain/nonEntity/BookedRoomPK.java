package com.a1tSign.backend.domain.nonEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class BookedRoomPK implements Serializable {

  @Column(name = "user_login")
  private String userLogin;

  @Column(name = "arrival")
  private Date arrival;
}
