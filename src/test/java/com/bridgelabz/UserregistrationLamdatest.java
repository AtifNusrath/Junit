package com.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserregistrationLamdatest {
    UserRegistrationLamda userRegistrationLamda = new UserRegistrationLamda();

    @Test
    public void givenFirstNameValid() {
        boolean result = true;
        result = userRegistrationLamda.validateFirstName.validate("Mohammed");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameInvalid() {
        boolean result = false;
        result = userRegistrationLamda.validateFirstName.validate("mohammed");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameValid() {
        boolean result = true;
        result = userRegistrationLamda.validateLastName.validate("Atif");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameInvalid() {
        boolean result = false;
        result = userRegistrationLamda.validateLastName.validate("atif");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailValid() {
        boolean result = true;
        result = userRegistrationLamda.validateEmail.validate("abc@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailInvalid() {
        boolean result = false;
        result = userRegistrationLamda.validateEmail.validate("abc@@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNoValid() {
        boolean result = true;
        result = userRegistrationLamda.validateMobile.validate("91 9874563210");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNoInValid() {
        boolean result = false;
        result = userRegistrationLamda.validateMobile.validate("9673772684");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPasswordValid() {
        boolean result = true;
        result = userRegistrationLamda.validatePassword.validate("A1@12g449");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordInValid() {
        boolean result = false;
        result = userRegistrationLamda.validatePassword.validate("A2g449");
        Assert.assertFalse(result);
    }
}
