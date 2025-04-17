package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {


    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Create CellPhone object
        CellPhone myPhone = new CellPhone();

        // Get input from user
        System.out.print("What is the serial number? ");
        int serial = input.nextInt();
        input.nextLine();

        System.out.print("What model is the phone? ");
        String model = input.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = input.nextLine();

        System.out.print("What is the phone number? ");
        String number = input.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = input.nextLine();

        // Set values in CellPhone object
        myPhone.setSerialNumber(serial);
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(number);
        myPhone.setOwner(owner);


        System.out.println("\n--- Phone Information ---");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());
    }
}