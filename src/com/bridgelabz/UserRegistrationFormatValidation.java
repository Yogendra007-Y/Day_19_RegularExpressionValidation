package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationFormatValidation {
    Matcher matcher;
    Pattern pattern;
    String RegexName = "^[A-Z]{1}+[a-z]{2,}\\s[A-Z]{1}[a-z]{2,}"; //User Registration Pattern For First Name And Last Name
    String RegexEmail = "^[A-Za-z0-9.]+@[a-z.]+[a-z]{1,3}$"; //User Registration Pattern For Email ID

    //Created A Method To Check User Name Validation With String RegexName
    public void nameValidation(String name) {
        pattern = Pattern.compile(RegexName);
        matcher = pattern.matcher(name);
        boolean validation = matcher.matches();
        System.out.println(validation);
        if(validation == false){
            System.out.println("Name Should Begin With Capital Letter, Have Minimum 3 Letters And Also Have Space Between First And Last Name ");
        }
    }
    //Created A Method To Check User Email ID Validation With String RegexEmail
    public void validateOfEmail(String email){
        pattern = Pattern.compile(RegexEmail);
        matcher = pattern.matcher(email);
        Boolean validation = matcher.matches();
        System.out.println(validation);
        if(validation == false){
            System.out.println("Email A Valid Email ID According To Pattern");
        }
    }
}