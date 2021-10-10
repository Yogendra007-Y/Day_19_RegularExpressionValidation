package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationFormatValidation {
    Matcher matcher;
    Pattern pattern;
    String RegexName = "^[A-Z]{1}+[a-z]{2,}\\s[A-Z]{1}[a-z]{2,}"; //User Registration Pattern For First Name And Last Name
    String RegexEmail = "^[A-Za-z0-9.]+@[a-z.]+[a-z]{1,3}$"; //User Registration Pattern For Email ID
    String RegexPhoneNo = "^[0-9]{2}\\s[0-9]{10}$"; //User Registration Pattern For Phone Number


    //Created A Method To Check UserName Validation With String RegexName
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
    public void emailIdValidation(String email){
        pattern = Pattern.compile(RegexEmail);
        matcher = pattern.matcher(email);
        Boolean validation = matcher.matches();
        System.out.println(validation);
        if(validation == false){
            System.out.println("Enter A Valid Email ID According To Pattern");
        }
    }
    //Created A Method To Check User Email ID Validation With String RegexPhoneNo
    public void phoneNumberValidation(String phoneNumber){
        pattern = Pattern.compile(RegexPhoneNo);
        matcher = pattern.matcher(phoneNumber);
        boolean val = matcher.matches();
        System.out.println(val);
        if(val == false){
            System.out.println("number should have ten digit word");
        }
    }
}