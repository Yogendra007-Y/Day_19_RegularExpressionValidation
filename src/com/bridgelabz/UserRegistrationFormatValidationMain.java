package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationFormatValidationMain {
    public static void main (String[] args){

        System.out.println("\n****Welcome To User Registration Format Validation Program****");
        UserRegistrationFormatValidation Validation = new UserRegistrationFormatValidation();
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter First Name And Last Name For Validation");
        String name = Sc.nextLine();
        Validation.nameValidation(name);

        System.out.println("Enter Email ID For Validation");
        String emailId = Sc.nextLine();
        Validation.emailIdValidation(emailId);

        System.out.println("Enter Phone Number For Validation");
        String phoneNumber = Sc.nextLine();
        Validation.phoneNumberValidation(phoneNumber);

        System.out.println("Enter Password For Validation");
        String password = Sc.nextLine();
        Validation.passwordValidation(password);
    }
}


