package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegistrationTest {
    @Test
    public void validateUserFirstName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = userRegistration.isValidFirstName("Mohammed");
        assertEquals(true, firstName );
    }

    @Test
    public void validateUserLastName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.isValidLastName("Atif");
        assertEquals(true, lastName );
    }
}
