package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName = myScanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = myScanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = myScanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = myScanner.nextLine().trim();

        String fullName = firstName + " " + middleName + " " + lastName;


        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);
    }
}
