package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 7, 8));

        int max = Collections.max(list);//first max number
        System.out.println(max);

        int n = 3;//Third max number

        for (int i = 1; i < n; i++) {


            list.removeIf(p -> p == Collections.max(list));
        }
        int max1 = Collections.max(list);//second max number


        /* list.removeIf(p -> p == Collections.max(list));
        int max2 = Collections.max(list);//third max number*/

        System.out.println(max1);


    }

}
/*
1. write a program that can return the nth largest number from an arraylist

        arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
        n = 5

        output:
        4*/
