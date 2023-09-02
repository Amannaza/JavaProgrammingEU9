package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FiveItemWithPrice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] product = new String[5];
        int[] price = new int[5];

        String result = "";

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter the product name:");
            product[i] = input.next();

            System.out.println("Enter the price:");
            price[i] = input.nextInt();
            result += product[i]+"----"+price[i]+"\n";
        }

        input.close();


        System.out.println( result);

    }
}
/*
1. Create an array named items with the length of 5
        2. Create an array named prices with the length of 5
        3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
        4. calculate the total price of the arrays
        5. display each item name and price in separate lines

        ItemName -- Price*/
