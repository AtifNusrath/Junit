package com.bridgelabz;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(true, lastName );
    }
    @Test
    public void validateEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.isValidLastName("user@domain.com");
        assertEquals(true, result);
    }
    @Test
    public void validateNumber() {
        assertEquals(true, UserRegistration.isValidNo());
    }
    @Test
    public void validatePassword() {
        assertEquals(true, UserRegistration.isValidPwd());
    }
}
