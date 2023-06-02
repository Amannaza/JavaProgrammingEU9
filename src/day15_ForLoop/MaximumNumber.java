package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int max=-2147483648;    //any user entered number will be greater than -2147483648

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num=scan.nextInt();

            if (num>max){
                max=num;
            }

        }
        scan.close();
        System.out.println("Max number is="+max);










    }
}
