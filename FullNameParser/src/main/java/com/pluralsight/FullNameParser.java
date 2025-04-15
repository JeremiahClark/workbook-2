package com.pluralsight;

import java.util.Scanner;

public class FullNameParser{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String input = scanner.nextLine().trim();

        // Split the input into parts by spaces
        String[] nameParts = input.split("\\s+");

        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        if (nameParts.length == 2) {
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {
            System.out.println("Invalid name format. Please enter a first and last name, with an optional middle name.");
            scanner.close();
            return;
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        scanner.close();
    }
}
