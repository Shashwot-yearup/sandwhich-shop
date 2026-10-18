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

        // if else statement to ask the user for a loaded sandwich.
        System.out.println("Would you like your sandwich loaded? (yes/no)");
        String loaded = scanner.next();

        if (loaded.equalsIgnoreCase("yes")) {
            if (sandwich == 1)
                price += 1.00;
            else
                price += 1.75;
            System.out.println("Loaded sandwich selected.");
            System.out.println("");
        }
        else if (loaded.equalsIgnoreCase("no")) {
            System.out.println("No extra charge.");
            System.out.println("");
        }
        else {
            System.out.println("Invalid choice. Please enter yes or no.");
            scanner.close();
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
            System.out.println("");
        }

        else if (age >= 65) {
            discount = 0.20;
            System.out.println("You get a 20% discount");
            System.out.println("");
        }

        else {
            System.out.println("You get no discount");
            System.out.println("");
            scanner.close();
            return;
        }

        //Calculate the final price
        double discountAmount = price * discount;
        double finalPrice = price - discountAmount;

        //shows the total with the discount.
        System.out.printf("Original price: $%.2f %n", price);
        System.out.printf("Discount: $%.2f %n", discountAmount);
        System.out.printf("Final price: $%.2f %n", finalPrice);
        System.out.printf("Thank you for your order");
    }
}