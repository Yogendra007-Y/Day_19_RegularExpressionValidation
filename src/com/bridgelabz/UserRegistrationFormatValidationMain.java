package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationFormatValidationMain {
    public static void main (String[] args){
        System.out.println("\n****Welcome To User Registration Format Validation Program****");
        UserRegistrationFormatValidation Validation = new UserRegistrationFormatValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name And Last Name For Validation");
        String name = scanner.nextLine();
        Validation.nameValidation(name);
        System.out.println("Enter Email ID For Validation");
        String emailId = scanner.nextLine();
        Validation.emailIdValidation(emailId);
        System.out.println("Enter Phone Number For");
        String number = scanner.nextLine();
        Validation.phoneNumberValidation(number);
    }
}


