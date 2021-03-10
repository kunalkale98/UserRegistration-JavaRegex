package com.bridgelabz;

import java.util.regex.Pattern;

interface IValid{
    String isValid(String input) throws InvalidInput;
}

public class UserRegistration {

    private static final String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";
    private static final String Phone_No_Pattern = "^[0-9]{1,3} [0-9]{10}$";
    private static final String Email_Pattern = "^[a-zA-Z]+[+_.-]{0,1}+[0-9A-Za-z]{0,3}+@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    private static final String Password_Pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}$";

    IValid firstName = fName -> {
        boolean fn = Pattern.matches(Name_Pattern, fName);
        if(fn==true) {return "Valid";}
        else{throw new InvalidInput("Invalid");}
    };

    IValid lastName = lName -> {
        boolean ln = Pattern.matches(Name_Pattern,lName);
        if(ln == true) { return "Valid"; }
        else{throw new InvalidInput("Invalid");}
    };

    IValid phoneNo = phoneNo -> {
        boolean ph = Pattern.matches(Phone_No_Pattern,phoneNo);
        if(ph == true) { return "Valid"; }
        else{ throw new InvalidInput("Invalid"); }
    };

    IValid email = emailTest -> {
        boolean eml = Pattern.matches(Email_Pattern,emailTest);
        if(eml == true) { return "Valid"; }
        else{ throw new InvalidInput("Invalid"); }
    };

    IValid passWord = passTest -> {
        boolean pass = Pattern.matches(Password_Pattern,passTest);
        if(pass == true) { return "Valid"; }
        else{ throw new InvalidInput("Invalid"); }
    };
}

