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
<<<<<<< HEAD

        boolean result = userRegistration.isValidFirstName("Mohammed");
        assertEquals(true, result);
=======
        boolean firstName = userRegistration.isValidFirstName("Mohammed");
        assertEquals(true, firstName );
>>>>>>> Uc2
    }

    @Test
    public void validateUserLastName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.isValidLastName("Atif");
        assertEquals(true, lastName );
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
