package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegistrationTest {
    @Test
    public void validateUserFirstName() {
        assertEquals(true, UserRegistration.isValidFirstName());
    }

    @Test
    public void validateUserLastName() {
        assertEquals(true, UserRegistration.isValidLastName());
    }
    @Test
    public void validateEmail() {
        assertEquals(true, UserRegistration.isValidEmail());
    }
}
