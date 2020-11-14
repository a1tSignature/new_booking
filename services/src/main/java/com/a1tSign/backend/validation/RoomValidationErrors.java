package com.a1tSign.backend.validation;

import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
public final class RoomValidationErrors {

  public static final String HOTEL_ID_IS_INVALID = "HOTEL_ID_IS_INVALID";
  public static final String NUMBER_OF_BEDS_IS_INVALID = "NUMBER_OF_BEDS_IS_INVALID";
  public static final String DESCRIPTION_IS_INVALID = "DESCRIPTION_IS_INVALID";
  public static final String DAILY_PRICE_IS_INVALID = "DAILY_PRICE_IS_INVALID";
  private static final Map<String, String> ERRORS = Map.ofEntries (
    Map.entry ( HOTEL_ID_IS_INVALID, "Hotel with such id does not exist" ),
    Map.entry ( NUMBER_OF_BEDS_IS_INVALID,"Minimum number of beds - 1" ),
    Map.entry ( DESCRIPTION_IS_INVALID,
      "The minimum description length is 30 characters, the maximum is 500 characters" ),
    Map.entry( DAILY_PRICE_IS_INVALID, "Minimum daily price - 1")
  );

  public static String getMessageByCode (String code ) {
    return ERRORS.get ( code );
  }

}
