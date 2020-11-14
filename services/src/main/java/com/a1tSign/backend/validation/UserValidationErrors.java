package com.a1tSign.backend.validation;

import lombok.NoArgsConstructor;

import java.util.Map;
@NoArgsConstructor
public  final class UserValidationErrors {

  public static final String EMAIL_HAS_INVALID_FORMAT = "EMAIL_HAS_INVALID_FORMAT";
  public static final String LAST_NAME_LENGTH_IS_INVALID = "LAST_NAME_LENGTH_IS_INVALID";
  public static final String FIRST_NAME_LENGTH_IS_INVALID = "FIRST_NAME_LENGTH_IS_INVALID";
  public static final String PERSONAL_INFO_MUST_BE_SET = "PERSONAL_INFO_MUST_BE_SET";
  public static final String ROLE_MUST_BE_SET = "ROLE_MUST_BE_SET";
  public static final String PHONE_FORMAT_IS_INVALID = "PHONE_FORMAT_IS_INVALID";
  public static final String LOCATION_DESCRIPTION_IS_INVALID = "LOCATION_DESCRIPTION_IS_INVALID";


  public static final Map<String, String> ERRORS = Map.ofEntries(
    Map.entry(ROLE_MUST_BE_SET, "Role must be set"),
    Map.entry(PERSONAL_INFO_MUST_BE_SET, "Personal info must be set"),
    Map.entry(FIRST_NAME_LENGTH_IS_INVALID, "Personal info must be set"),
    Map.entry(LAST_NAME_LENGTH_IS_INVALID, "Personal info must be set"),
    Map.entry(EMAIL_HAS_INVALID_FORMAT, "Personal info must be set"),
    Map.entry(PHONE_FORMAT_IS_INVALID, "Phone number must be set")
  );

  public static String getMessageByCode(String code) {
    return ERRORS.get(code);
  }

}
