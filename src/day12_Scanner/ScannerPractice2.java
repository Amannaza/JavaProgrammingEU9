package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //System.out.println("Enter True or False");
        //boolean result = input.nextBoolean();
        //System.out.println("result = " + result);


        System.out.println("Enter the name:");
        String name = input.next();     //next method only reads until a space
        System.out.println("name : " + name);

          input.close();
    }

}
