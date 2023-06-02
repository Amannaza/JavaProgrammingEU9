package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int length = input.nextInt();
        int[] numbers = new int[length];

        double sum = 0;

        double avarage = 0;

        for (int i = 0; i < length; i++) {

            System.out.println("Enter a number:");
            numbers[i] = input.nextInt();

            sum += numbers[i];


        }
        avarage = sum / numbers.length;

        System.out.println("Avarage=" + avarage);
        input.close();


    }
}
