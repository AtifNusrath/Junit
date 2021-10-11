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
        boolean result = userRegistration.isValidFirstName("Mohammed");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameSad() {
        boolean result = userRegistration.isValidFirstName("mohammed");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameHappy() {
        boolean result = userRegistration.isValidLastName("Atif");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameSad() {
        boolean result = userRegistration.isValidLastName("atif");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailHappy() {
        boolean result = userRegistration.isValidEmail("abc@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailSad() {
        boolean result = userRegistration.isValidEmail("abc.@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNoHappy() {
        boolean result = userRegistration.isValidMobileNo("91 9874563210");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNoSad() {
        boolean result = userRegistration.isValidMobileNo("98745203612");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordOneHappy() {
        boolean result = userRegistration.isValidPwd1("abcdbd34");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordOneSad() {
        boolean result = userRegistration.isValidPwd1("fhfdhg");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordTwoHappy() {
        boolean result = userRegistration.isValidPwd2("Aghtjkyf");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordTwoSad() {
        boolean result = userRegistration.isValidPwd2("ghjkiuyh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordThreeHappy() {
        boolean result = userRegistration.isValidPwd3("1Abhujkg");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordThreeSad() {
        boolean result = userRegistration.isValidPwd3("Agjgtyfg");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordFourHappy() {
        boolean result = userRegistration.isValidPwd4("@A1hjkih");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordFourSad() {
        boolean result = userRegistration.isValidPwd4("ghjuykhg");
        Assert.assertFalse(result);
    }
}