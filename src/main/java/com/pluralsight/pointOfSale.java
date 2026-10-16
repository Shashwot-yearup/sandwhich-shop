package com.pluralsight;

import java.util.Scanner;

public class pointOfSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//created a scanner.

        //asked the user for which size sandwich do they want.
        System.out.println("""
                What size of the sandwich would you like?
                    1.Regular ($5.45)
                    2.Large ($8.95)""");
        int sandwich = scanner.nextInt();
        double price;

        // if else statement to set the price to the user selection.
        if(sandwich == 1){
            price = 5.45;
        }

        else if (sandwich == 2){
            price = 8.95;
        }

        else{
            System.out.println("Not a valid choice");
        }

    }
}