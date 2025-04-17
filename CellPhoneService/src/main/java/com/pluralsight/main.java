package com.pluralsight;

import java.util.Scanner;

public class main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new CellPhone object
        CellPhone phone = new CellPhone();

        // Ask the user for phone details
        System.out.print("What is the serial number? ");
        long serial = scanner.nextLong();
        scanner.nextLine(); // Clear leftover newline

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();


        // Set values in CellPhone object
        phone.setSerialNumber((int) serial);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        // Use getters to display the info
        System.out.println(" Cell Phone Information:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());



    }
}