package com.example.altoria.password_validator;

public class Validator {
    //First stage
    public static String PSWSTG1(String psw) {
        String RuleMatch = "";
        //If the password is "password" no matter lower or upper cass
        //Then RuleNo plus 1
        if(psw.equalsIgnoreCase("password")) {
            RuleMatch = RuleMatch + "p" ;
        }

        //If the password is less than 8 characters then RuleNo plus 2
        if(psw.length() < 8) {
            RuleMatch = RuleMatch + "8";
        }
        return RuleMatch;
    }
    
}
