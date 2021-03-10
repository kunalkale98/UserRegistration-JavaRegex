package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PassValidation_IfFalse {
    private String passTest;

    public PassValidation_IfFalse(String passTest){
        this.passTest = passTest;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[] { "abcd", "ABCD#0982", "abcD$$1245", "abcd@1234", "Abcd$efgh" });
    }

    @Test
    public void password_Validation_AsPerTheGiven_Input()  {
        UserRegistration validation = new UserRegistration();
        String pass = null;
        try {
            pass = validation.passWord(this.passTest);
        } catch (InvalidInput e) {
            Assert.assertEquals("Invalid",e.getMessage());

        }
    }
}





