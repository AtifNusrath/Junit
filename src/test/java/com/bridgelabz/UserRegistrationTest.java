package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
@RunWith(Parameterized.class)
public class UserRegistrationTest {


    @Test
    public void validateUserFirstName() {
        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.isValidFirstName("Mohammed");
        assertEquals(true, result);

    }

    @Test
    public void validateUserLastName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.isValidLastName("Atif");
        assertEquals(true, lastName);
    }

    @Test
    public void validateEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidEmail("user@domain.com");
        assertEquals(true, result);
    }

    @Test
    public void validateNumber() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidMobileNo("91 9874563210");
        assertEquals(true, result);
    }
    @Test
    public void validatePassword() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidPwd("Admin07pass@word");
        assertEquals(true, result);
    }

}