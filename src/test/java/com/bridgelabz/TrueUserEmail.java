package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TrueUserEmail {
    private String emailTest;

    public TrueUserEmail(String emailTest){
        this.emailTest = emailTest;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[] { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" });
    }

    @Test
    public void email_Validation_WhenGiven_Proper_Email() {
        UserRegistration validation = new UserRegistration();
        boolean eml = validation.email(this.emailTest);
        Assert.assertTrue(eml);
    }
}



