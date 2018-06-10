package com.example.altoria.password_validator;

import java.util.regex.Pattern;

public class Validator {
    //First stage
    public static String PSWSTG1(String psw) {
        String RuleMatch = "";
        //If the password is "password" no matter lower or upper cass
        //Then RuleNo plus 1
        if (psw.equalsIgnoreCase("password")) {
            RuleMatch = RuleMatch + "p";
        }

        //If the password is less than 8 characters then RuleNo plus 2
        if (psw.length() < 8) {
            RuleMatch = RuleMatch + "8";
        }
        return RuleMatch;
    }
    //Second stage
    public static String PSWSTG2(String psw) {
        String RuleMatch  = PSWSTG1(psw);

        //checking special character
        if(psw.indexOf('~') == -1 && psw.indexOf('!') == -1 && psw.indexOf('@') == -1 &&
                psw.indexOf('#') == -1 && psw.indexOf('$') == -1 && psw.indexOf('%') == -1 &&
                psw.indexOf('^') == -1 && psw.indexOf('&') == -1 && psw.indexOf('*') == -1 &&
                psw.indexOf('-') == -1 && psw.indexOf('=') == -1 && psw.indexOf('+') == -1){
            RuleMatch = RuleMatch + "s";
        }
        //checking digit
        if(!Pattern.compile("[0-9]").matcher(psw).find()){
            RuleMatch = RuleMatch + "d";
        }
        //checking lower case
        if(!Pattern.compile("[a-z]").matcher(psw).find()){
            RuleMatch = RuleMatch + "l";
        }
        //checking upper case
        if(!Pattern.compile("[A-Z]").matcher(psw).find()){
            RuleMatch = RuleMatch + "u";
        }
        return RuleMatch;
    }
}
