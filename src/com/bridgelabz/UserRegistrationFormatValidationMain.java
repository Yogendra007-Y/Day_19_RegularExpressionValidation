package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationFormatValidationMain {
    public static void main (String[] args){
        System.out.println("\n****Welcome To User Registration Format Validation Program****");
        UserRegistrationFormatValidation Validation = new UserRegistrationFormatValidation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First NAmer And Last Name For Validation");
        String name = scanner.nextLine();
        Validation.nameValidation(name);
        System.out.println("Enter the email to validation");
        String res = scanner.nextLine();
        Validation.validateOfEmail(res);
    }
}



