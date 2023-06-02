package day18_Nested_Loop;

import java.util.Scanner;

public class DivisionAndMultiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int mult = 0;
        int div = 0;

        System.out.println("Enter math Oparetor:");
        char mathOparetor = input.next().charAt(0);

        if (mathOparetor == '*') {
            for (int i = 0; i < num1; i++) {
                mult += num2;
            }
            System.out.println("Multiplication result=" + mult);
        } else if (mathOparetor == '/') {
            while (num1 >= num2) {
                num1 -= num2;
                div++;
            }
            System.out.println("Division result=" + div);
            System.out.println("Reminder=" + num1);
        }

        input.close();

    }
}
