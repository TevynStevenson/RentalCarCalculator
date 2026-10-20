package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {

        // Initialize scanner
        System.out.println("What is the pickup date?(MMDDYY)");
        Scanner rentalCar = new Scanner(System.in);
        String pickupDate = rentalCar.nextLine();

        // Ask user for number of days for the rental
        System.out.println("How many days for the rental");
        int totalDays = rentalCar.nextInt();

        // Add after .nextInt
        rentalCar.nextLine();


        // Ask user for electric toll tag $3.95
         System.out.println("Would You Like A Toll Tag? Extra $3.95/day");
        String tollTag = rentalCar.nextLine();

         // Ask user whether they want GPS at $2.95/day
        System.out.println("Would You Like GPS? Extra $2.95/day");
        String gps = rentalCar.nextLine();

        //Ask user if they want roadside assistance $3.95/day
        System.out.println("Would You Like Roadside Assistance? Extra $2.95/day");
        String roadSide = rentalCar.nextLine();

        // Ask for users age
        System.out.println("""
                What Is Your Age?
                Under 25 - Extra 8.99/day""");
        int age = rentalCar.nextInt();

        rentalCar.nextLine();

        //Declare Variables for costs
        double basicRental = 29.99;
        double electronicToll = 0.0;
        double gpS = 0.0;
        double roadsideAssistance = 0.0;
        double underageSurcharge = 0.0;
        double total;

        // Initialize totals
        double rentalPrice = totalDays * basicRental;

        // Add if statements
        if(tollTag.equals("Yes")){
            electronicToll = 3.95 * totalDays;
        } else if (tollTag.equals("No")){
            electronicToll = 0.0;
        }
            if (gps.equals("Yes")){
            gpS = 2.95 * totalDays;
        } else if (gps.equals("No")){
                gpS = 0.0;
            }
                if (roadSide.equals("Yes")){
            roadsideAssistance = 3.95 * totalDays;
        } else if (roadSide.equals("No")){
                    roadsideAssistance = 0.0;
                }
                    if(age < 25){
            underageSurcharge = (basicRental * .30) * totalDays;
        } else if (age >25){
            underageSurcharge = 0.0;
                    }


        //Calculate The Total %n----next line, %.2f---- 2 decimals in float
        total =  (totalDays * basicRental) + gpS + electronicToll + roadsideAssistance + underageSurcharge;
                    System.out.printf("Total: $%.2f%n", total);



        }


    }

