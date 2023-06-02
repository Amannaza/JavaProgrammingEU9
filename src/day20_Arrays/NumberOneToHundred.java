package day20_Arrays;

import java.util.Arrays;

public class NumberOneToHundred {
    public static void main(String[] args) {

        int[] number = new int[100];

        for (int i = 0, j = 1; i < number.length; i++, j++) {
            number[i] =  j;
        }

        System.out.println(Arrays.toString(number));

        System.out.println("---------------------------------------");

        int num[]=new int[100];

        for (int l = 0,m=100; l < num.length; l++,m--) {
            num[l]=m;
        }
        System.out.println(Arrays.toString(num));


    }
}
