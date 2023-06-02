package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {

        int[] intArray = {1, 2, -7, 7, 9};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 11.7, 5.5, 4.5};
        Arrays.sort(doubleArray);


        char[] charArray = {'s', 'A', 'h', 'M'};
        Arrays.sort(charArray);

        System.out.println("---------------------------");

        // sum of numbers 10 and 20
        int sum2 = sumOfNumbers(10, 20);

        //sum of numbers 10,20,30,40
        int sum3 = sumOfNumbers(10, 20, 30, 40);

        //sum of numbers 18.2 and 30.7
        double sum4 = sumOfNumbers(18.2,30.7);

        //sum of 5.5,6.5,4.6
        double sum5 = sumOfNumbers(5.5, 6.5, 4.6);

    }

    public static int sumOfNumbers(int num1, int num2) {

        return num1 + num2;
    }


    public static double sumOfNumbers(double num1,double num2) {     //Summation of two decimal number
        return num1 + num2;
    }


    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3) {     //Summation of three decimal number
        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }


    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {  //Summation of four decimal number
        return  sumOfNumbers(num1,num2,num3)+num4;
    }





}