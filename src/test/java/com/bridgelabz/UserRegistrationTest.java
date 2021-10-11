package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstNameHappy() {
        try {
            Assert.assertTrue(userRegistration.isValidFirstName("Mohammed"));
            System.out.println("Valid First Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenFirstNameSad() {
        try {
            Assert.assertTrue(userRegistration.isValidFirstName("mohammed"));
            System.out.println("Valid First Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastNameHappy() {
        try {
            Assert.assertTrue(userRegistration.isValidLastName("Atif"));
            System.out.println("Valid Last Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastNameSad() {
        try {
            Assert.assertTrue(userRegistration.isValidLastName("atif"));
            System.out.println("Valid Last Name");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmailHappy() {
        try {
            Assert.assertTrue(userRegistration.isValidEmail("abc@gmail.com"));
            System.out.println("Valid Email");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmailSad() {
        try {
            Assert.assertTrue(userRegistration.isValidEmail("abc@gmail@.com@"));
            System.out.println("Valid Email");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMobileNoHappy() {
        try {
            Assert.assertTrue(userRegistration.isValidMobileNo("91 9876543210"));
            System.out.println("Valid Mobile Number");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMobileNoSad() {
        try {
            Assert.assertTrue(userRegistration.isValidMobileNo("91 20876543210"));
            System.out.println("Valid Mobile Number");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenPasswordFourHappy() {
        try {
            Assert.assertTrue(userRegistration.isValidPwd("Abcd@12efgh"));
            System.out.println("Valid Password");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenPasswordFourSad() {
        try {
            Assert.assertTrue(userRegistration.isValidPwd("abcdefgh"));
            System.out.println("Valid Password");
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}