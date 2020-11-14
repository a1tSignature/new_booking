package com.a1tSign.backend;

import lombok.var;

public enum Role {

  LANDLORD(1),
  TENANT(2);

  private final int id;

  Role(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public static Role fromId(Integer id) {
    if (id == null) {
      return null;
    }

    for (var value: values()) {
      if (id.equals(value.id)) {
        return value;
      }
    }

    return null;
  }
}
