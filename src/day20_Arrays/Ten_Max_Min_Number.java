package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ten_Max_Min_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] num = new int[10];
        int min = num[0];
        int max = num[0];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number:");
            num[i] = scan.nextInt();

            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }

        scan.close();
        System.out.println("Numbers"+Arrays.toString(num));
        System.out.println("Minimum number:" + min);
        System.out.println("Maximum number:" + max);
    }
}
