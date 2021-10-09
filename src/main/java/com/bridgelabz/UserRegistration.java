package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean isValidFirstName(String firstName) {

        String pattern = "^[A-Z][a-z]{3,}";
        Pattern fnme = Pattern.compile(pattern);
        if (firstName == null) {
            return false;
        }
        Matcher match = fnme.matcher(firstName);
        return match.matches();
    }

    public static boolean isValidLastName(String lastName) {
        String lname = "^[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(lname);
        if (lastName == null) {
            return false;
        }
        Matcher m2 = pattern.matcher(lastName);
        return m2.matches();
    }
}
