package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PassValidation_IfTrue {
    private String passTest;

    public PassValidation_IfTrue(String passTest){
        this.passTest = passTest;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[] { "Abc@1234", "ABcd#0982", "abCd$24ef" });
    }

    @Test
    public void password_Validation_AsPerTheGiven_Input() {
        UserRegistration validation = new UserRegistration();
        boolean pass = validation.passWord(this.passTest);
        Assert.assertTrue(pass);
    }
}




