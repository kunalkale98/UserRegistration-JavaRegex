package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void firstName_WhenProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        boolean fn = validate.firstName("Kunal");
        Assert.assertTrue(fn);
    }

    @Test
    public void firstName_WhenNotProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        boolean fn = validate.firstName("Kk");
        Assert.assertFalse(fn);
    }

    @Test
    public void lastName_WhenProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        boolean ln = validate.lastName("Kale");
        Assert.assertTrue(ln);
    }

    @Test
    public void lastName_WhenNotProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        boolean ln = validate.lastName("Ka");
        Assert.assertFalse(ln);
    }

    @Test
    public void phoneNo_WhenProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        boolean ph = validate.phoneNo("91 1234567890");
        Assert.assertTrue(ph);
    }

    @Test
    public void phoneNo_WhenNotProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        boolean ph = validate.phoneNo("91 12345678");
        Assert.assertFalse(ph);
    }

}

