package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");

        double r = input.nextDouble();
        double PI = 3.14;
        input.close();

        double diameter = 2 * r;
        double area = PI * r * r;
        double perimeter = 2 * PI * r;

        System.out.println("r = " + r);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
