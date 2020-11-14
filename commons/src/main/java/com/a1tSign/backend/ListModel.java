package com.a1tSign.backend;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ListModel<T> {
  private List<T> list;
  private long amount;

  public ListModel ( ) {
    this.list = new ArrayList<>( );
    this.amount = 0;
  }

  public ListModel ( List<T> list, long amount ) {
    this.list = list;
    this.amount = amount;
  }
}
