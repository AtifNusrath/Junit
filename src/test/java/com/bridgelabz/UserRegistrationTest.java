package com.bridgelabz;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegistrationTest {
    @Test
    public void validateUserFirstName() {
        assertEquals(true, UserRegistration.isValidFirstName());
    }

}
