package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        System.out.println("Enter an integer : ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        System.out.println("Enterb decimal : ");
        double num2 = input.nextDouble();

        System.out.println("Addition: " + (num1 + num2));
        input.close();
    }
}
