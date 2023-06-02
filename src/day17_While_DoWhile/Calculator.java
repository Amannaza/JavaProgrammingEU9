package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = input.nextInt();

        System.out.println("Enter your second number:");
        int num2 = input.nextInt();

        System.out.println("Enter a math oparetor:");
        char mathOparetor = input.next().charAt(0);

        while (!(mathOparetor=='+'||mathOparetor=='-')){
            System.err.println("Invalid please re-enter:");
             mathOparetor = input.next().charAt(0);

        }

       /* for (int i = 0; !(mathOparetor=='+'||mathOparetor=='-'); i++) {
            System.err.println("Invalid please re-enter:");
            mathOparetor = input.next().charAt(0);

        }*/

        int result=(mathOparetor=='+')? num1+num2 : num1-num2;

        System.out.println(result);
    }
}
