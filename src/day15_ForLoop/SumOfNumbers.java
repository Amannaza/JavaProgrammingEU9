package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < 101; i++) {
            sum += i;
        }

        System.out.println(sum);
        System.out.println("--------------------------");

        int total = 0;

        Scanner input = new Scanner(System.in);
        // System.out.println("Enter 5 numbers:");

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter " + i + ". number:");
            int n = input.nextInt();
            total += n;
        }
        input.close();
        System.out.println(total);
    }
}

