package com.bridgelabz;

import org.junit.jupiter.api.Test;
<<<<<<< HEAD

=======
import java.util.Scanner;
>>>>>>> UC1
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegistrationTest {
    Scanner scanner = new Scanner(System.in);
    @Test
    public void validateUserFirstName() {
        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.isValidFirstName("Mohammed");
        assertEquals(true, result);
    }

    @Test
    public void validateUserLastName() {
        assertEquals(true, UserRegistration.isValidLastName());
    }
    @Test
    public void validateEmail() {
        assertEquals(true, UserRegistration.isValidEmail());
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
