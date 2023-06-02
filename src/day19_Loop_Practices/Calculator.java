package day19_Loop_Practices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = input.nextInt();

        System.out.println("Enter a math operator:");
        char mathOperator=input.next().charAt(0);

        if (!(mathOperator=='+'||mathOperator=='-')){
            System.err.println("Invalid mat Operator!");
            System.exit(0);
        }

        System.out.println("Enter second number:");
        int num2 = input.nextInt();


        input.close();
    }
}
