package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean isValidFirstName(String firstName) throws UserRegistrationException {
        try {
            String pattern = "^[A-Z][a-z]{3,}";
            Pattern fnme = Pattern.compile(pattern);
            if (firstName == null) {
                return false;
            }
            Matcher match = fnme.matcher(firstName);
            return match.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Entry!");
        }
    }

    public static boolean isValidLastName(String lastName) throws UserRegistrationException {
        try {
            String lname = "^[A-Z][a-z]{3,}";
            Pattern pattern = Pattern.compile(lname);
            if (lastName == null) {
                return false;
            }
            Matcher m2 = pattern.matcher(lastName);
            return m2.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Entry!");
        }
    }

    public static boolean isValidEmail(String emails) throws UserRegistrationException {
        try {
            String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern pattern = Pattern.compile(regex);
            if (emails == null) {
                return false;
            }
            Matcher matcher = pattern.matcher(emails);
            return matcher.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Entry!");
        }
    }

    public static boolean isValidMobileNo(String mobileNo) throws UserRegistrationException {
        try {
            String mobile = "^(\\d{0,9}[\\s]?)?\\d{10}$";
            Pattern mob = Pattern.compile(mobile);
            if (mobileNo == null) {
                return false;
            }
            Matcher matcher = mob.matcher(mobileNo);
            return matcher.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Entry!");
        }
    }


    public static boolean isValidPwd(String pwd) throws UserRegistrationException {
        try {
            String password = "(?=.*d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
            Pattern pattern = Pattern.compile(password);
            if (pwd == null) {
                return false;
            }
            Matcher match = pattern.matcher(pwd);
            return match.matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Entry!");
        }
    }

}

