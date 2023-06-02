package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int min = 2147483647;

        System.out.println("Enter 5 number:");

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num < min) {
                min = num;
            }
        }
        input.close();
        System.out.println("Min number is=" + min);
    }
}
