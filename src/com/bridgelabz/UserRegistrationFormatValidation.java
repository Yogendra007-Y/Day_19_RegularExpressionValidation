package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationFormatValidation {
    Matcher matcher;
    Pattern pattern;
    String RegexName = "^[A-Z]{1}+[a-z]{2,}\\s[A-Z]{1}[a-z]{2,}"; //User Registration Pattern For First Name And Last Name
    String RegexEmail = "^[A-Za-z0-9.]+@[a-z.]+[a-z]{1,3}$"; //User Registration Pattern For Email ID
    String RegexPhoneNo = "^[0-9]{2}\\s[0-9]{10}$"; //User Registration Pattern For Phone Number
    String RegexPassword = "^[A-Z]{1,}+[a-zA-Z0-9]{8,}"; //User Registration Pattern For Password

    public void validationOfRegex(String regex,String name){
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
    }
    //Created A Method To Check UserName Validation With String RegexName
    public void nameValidation(String name) {
        validationOfRegex(RegexName,name);
        boolean validationName = matcher.matches();
        System.out.println(validationName);
        if(!validationName){
            System.out.println("Enter Name According To Pattern: [A-Z]{1}+[a-z]{2,}\\s[A-Z]{1}[a-z]{2,} ");
        }
    }
    //Created A Method To Check User Email ID Validation With String RegexEmail
    public void emailIdValidation(String email){
        validationOfRegex(RegexEmail,email);
        Boolean validationEmail = matcher.matches();
        System.out.println(validationEmail);
        if(!validationEmail){
            System.out.println("Enter Email ID According To Pattern: [A-Za-z0-9.]+@[a-z.]+[a-z]{1,3}");
        }
    }
    //Created A Method To Check User Phone Number Validation With String RegexPhoneNo
    public void phoneNumberValidation(String phoneNumber){
        validationOfRegex(RegexPhoneNo,phoneNumber);
        boolean validationPhoneNo = matcher.matches();
        System.out.println(validationPhoneNo);
        if(!validationPhoneNo){
            System.out.println("Enter Phone Number According TO Pattern: [0-9]{2}\\s[0-9]{10} ");
        }
    }
    //Created A Method To Check User Password Validation With String RegexPassword
    public void passwordValidation(String password){
        validationOfRegex(RegexPassword, password);
        boolean validationPassword = matcher.matches();
        System.out.println(validationPassword);
        if(!validationPassword) {
            System.out.println("Enter Password According To Pattern: [A-Z]{1,}+[a-zA-Z0-9]{8,}");
        }
    }
}