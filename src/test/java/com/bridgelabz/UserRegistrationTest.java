package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void firstName_WhenProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        String fn = null;
        try {
            fn = validate.firstName.isValid("Kunal");
        } catch (InvalidInput e) {
            Assert.assertEquals("Valid",e.getMessage());
        }
    }

    @Test
    public void firstName_WhenNotProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        String fn = null;
        try {
            fn = validate.firstName.isValid("Kk");
        } catch (InvalidInput e) {
            Assert.assertEquals("Invalid",e.getMessage());
        }
    }

    @Test
    public void lastName_WhenProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        String ln = null;
        try {
            ln = validate.lastName.isValid("Kale");
        } catch (InvalidInput e) {
            Assert.assertEquals("Valid",e.getMessage());
        }
    }

    @Test
    public void lastName_WhenNotProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        String ln = null;
        try {
            ln = validate.lastName.isValid("Ka");
        } catch (InvalidInput e) {
            Assert.assertEquals("Invalid",e.getMessage());
        }
    }

    @Test
    public void phoneNo_WhenProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        String ph = null;
        try {
            ph = validate.phoneNo.isValid("91 1234567890");
        } catch (InvalidInput e) {
            Assert.assertEquals("Valid",e.getMessage());
        }
    }

    @Test
    public void phoneNo_WhenNotProper_ReturnTrue() {
        UserRegistration validate = new UserRegistration();
        String ph = null;
        try {
            ph = validate.phoneNo.isValid("91 12345678");
        } catch (InvalidInput e) {
            Assert.assertEquals("Invalid",e.getMessage());
        }
    }
}

