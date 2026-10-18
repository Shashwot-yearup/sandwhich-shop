package com.pluralsight;

import java.util.Scanner;

public class pointOfSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//created a scanner.

        //asked the user for which size sandwich do they want.
        System.out.println("""
                What size of the sandwich would you like?
                    1.Regular ($5.45)
                    2.Large ($8.95)
                Please pick 1 or 2""");
        int sandwich = scanner.nextInt(); // asked the user input
        double price;

        // if else statement to set the price to the user selection.
        if (sandwich == 1)
            price = 5.45;

        else if (sandwich == 2)
            price = 8.95;

        else {
            System.out.println("Not a valid choice");
            return;
        }

        //asked the user for their age
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        double discount;

        //if else statement to ask for the user age.
        if (age <= 17) {
            discount = 0.10;
            System.out.println("You get a 10% discount");
        }

        else if (age >= 65) {
            discount = 0.20;
            System.out.println("You get a 20% discount");
        }

        else{
            System.out.println("You get no discount");
        }


    }
}