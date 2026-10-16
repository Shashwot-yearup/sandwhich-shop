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
                """);
        int sandwich = scanner.nextInt();


    }
}
