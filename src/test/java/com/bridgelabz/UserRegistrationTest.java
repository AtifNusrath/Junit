package com.bridgelabz;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegistrationTest {
    Scanner scanner = new Scanner(System.in);
    @Test
    public void validateUserFirstName() {
        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.isValidFirstName("Mohammed");
        assertEquals(true, result);
    }

}
