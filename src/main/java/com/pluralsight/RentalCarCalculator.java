package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {

        // Initialize scanner
        Scanner rentalCar = new Scanner(System.in);
        System.out.println("What is the pickup date?");

        // Ask user for number of days for the rental
        int totalDays = rentalCar.nextInt();
        System.out.println("How many days for the rental");

        rentalCar.nextLine();

        // Ask user for electric toll tag $3.95
         String tollTag = rentalCar.nextLine();
         System.out.println("Would You Like A Toll Tag? Extra $3.95/day");

         // Ask user whether they want GPS at $2.95/day
        String gps = rentalCar.nextLine();
        System.out.println("Would You Like GPS? Extra $2.95/day");

        //Ask user if they want roadside assistance $3.95/day
        String roadSide = rentalCar.nextLine();
        System.out.println("Would You Like Roadside Assistance? Extra $2.95/day");

        rentalCar.nextLine();

        // Ask for users age
        System.out.println("What Is Your Age");
        int age = rentalCar.nextInt();

        rentalCar.nextLine();


    }
}
