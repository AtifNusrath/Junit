package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean isValidFirstName() {

        String firstName = "Mohammed";
        String pattern = "^[A-Z][A-Za-z]{2,}";
        Pattern fnme = Pattern.compile(pattern);
        if (firstName == null) {
            return false;
        }
        Matcher match = fnme.matcher(firstName);
        return match.matches();
    }

    public static boolean isValidLastName() {
        String lastName = "Atif";
        String lname = "^[A-Z][A-Za-z]{3,}";
        Pattern pattern = Pattern.compile(lname);
        if (lastName == null) {
            return false;
        }
        Matcher m2 = pattern.matcher(lastName);
        return m2.matches();
    }
}
