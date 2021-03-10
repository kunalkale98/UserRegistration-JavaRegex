package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FalseUserEmail {
    private String emailTest;

    public FalseUserEmail(String emailTest){
        this.emailTest = emailTest;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[] { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
                                            "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com.", "abc@abc@gmail.com",
                                            "abc@gmail.com.1a", "abc@gmail.com.aa.au"});
    }

    @Test
    public void email_Validation_WhenGiven_Improper_Email() {
        UserRegistration validation = new UserRegistration();
        boolean eml = validation.email(this.emailTest);
        Assert.assertFalse(eml);
    }
}



