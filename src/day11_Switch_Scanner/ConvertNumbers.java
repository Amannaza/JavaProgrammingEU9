package day11_Switch_Scanner;

public class ConvertNumbers {
    public static void main(String[] args) {

        int num = 78;


        String result = (num == 1) ? "One" : (num == 2) ? "Two" : (num == 3) ? "Three" : (num == 4) ? "Four" : (num == 5) ? "Five" : (num == 6) ? "Six" : (num == 7) ? "Seven" : (num == 8) ? "Eight" : (num == 9) ? "Nine" : "Not Numerical Number";

        System.out.println(result);
    }
}
