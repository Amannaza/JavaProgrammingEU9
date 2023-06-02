package day12_Scanner;

import java.util.Scanner;

public class CentToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int money = input.nextInt();

        input.close();

        int dollar = money / 100;
        int cent = money % 100;

        System.out.println("Total money= " + dollar + " dollars and " + cent + " cents.");


    }
}
