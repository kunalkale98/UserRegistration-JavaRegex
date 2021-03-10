package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    private static final String Name_Pattern = "^[A-Z]{1}[a-z]{2,}$";
    private static final String Phone_No_Pattern = "^[0-9]{1,3} [0-9]{10}$";
    private static final String Email_Pattern = "^[a-zA-Z]+[+_.-]{0,1}+[0-9A-Za-z]{0,3}+@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    private static final String Password_Pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}$";

    public String firstName(String fName) throws InvalidInput {
        Pattern P = Pattern.compile(Name_Pattern);
        Matcher M = P.matcher(fName);
        Boolean fn = M.matches();
        if (fn == true) {
            return "Valid";
        } else {
            throw new InvalidInput("Invalid");
        }
    }

    public String lastName(String lName) throws InvalidInput {
        Pattern P = Pattern.compile(Name_Pattern);
        Matcher M = P.matcher(lName);
        Boolean ln = M.matches();
        if(ln == true) {
            return "Valid";
        }else{
            throw new InvalidInput("Invalid");
        }
    }

    public String phoneNo(String phoneNo) throws InvalidInput {
        Pattern P = Pattern.compile(Phone_No_Pattern);
        Matcher M = P.matcher(phoneNo);
        Boolean ph = M.matches();
        if(ph == true) {
            return "Valid";
        }else{
            throw new InvalidInput("Invalid");
        }
    }

    public String email(String emailTest) throws InvalidInput {
        Pattern P = Pattern.compile(Email_Pattern);
        Matcher M = P.matcher(emailTest);
        Boolean eml = M.matches();
        if(eml == true) {
            return "Valid";
        }else{
            throw new InvalidInput("Invalid");
        }
    }

    public String passWord(String passTest) throws InvalidInput {
        Pattern P = Pattern.compile(Password_Pattern);
        Matcher M = P.matcher(passTest);
        Boolean pass = M.matches();
        if(pass == true) {
            return "Valid";
        }else{
            throw new InvalidInput("Invalid");
        }
    }
}

