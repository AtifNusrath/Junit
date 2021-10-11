package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserValidaterLamda {
    boolean validate(String pattern);
}
public class UserRegistrationLamda {
    private final String NAME_PATTERN = "^[A-Z][a-z]{3,}$";
    private final String EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private final String MOBILE_PATTERN = "^(\\d{0,9}[\\s]?)?\\d{10}$";
    private final String PASSWORD4_PATTERN = "^(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[0-9])(?=.*[A-Z])[^\\s]{8,}$";

    UserValidaterLamda validateFirstName = (pattern) -> (Pattern.compile(NAME_PATTERN).matcher(pattern).matches());
    UserValidaterLamda validateLastName = (pattern) -> (Pattern.compile(NAME_PATTERN).matcher(pattern).matches());
    UserValidaterLamda validateEmail = (pattern) -> (Pattern.compile(EMAIL_PATTERN).matcher(pattern).matches());
    UserValidaterLamda validateMobile = (pattern) -> (Pattern.compile(MOBILE_PATTERN).matcher(pattern).matches());
    UserValidaterLamda validatePassword = (pattern) -> (Pattern.compile(PASSWORD4_PATTERN).matcher(pattern).matches());

}
