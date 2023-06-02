package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        //1. create a method that can remove duplciated characters from a string and returns the new value
        //					"aaabbcccc" ===> "abc"

        String str = "aaaaaaaaabbbbbbcccccceeeeeeeeeedddddddf";

        str = removeDublicates(str);
        System.out.println(str);
        System.out.println("--------------------");

        //	2. create a method that can return the maximum number from an array of integers

        int[] arrt = {1, 2, 3, 4, 13, -6, 7, 8};

        int maximum = maxNumber(arrt);
        System.out.println(maximum);
        System.out.println("--------------------");

        //	3. create a method that can return the minimum number from an array of integers

        int minimum = minNumber(arrt);
        System.out.println(minimum);
        System.out.println("--------------------");

        /*   4. create a method that return the reversed array*/
        /*     					{1,2,3,4,5} === > {5,4,3,2,1}*/

        int[] reverse = reverse(arrt);
        System.out.println(Arrays.toString(reverse));
        System.out.println("--------------------");


            /*5. create a method that can merge two arrays and returnj the new array
              				arr1 = {1,2,3}
              				arr2 = {4,5}

             				{1,2,3,4,5}                                             */
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};

        int[] newMerged = merge(arr1, arr2);
        System.out.println(Arrays.toString(newMerged));
    }

    public static String removeDublicates(String str) {

        String result = "";
        for (char each : str.toCharArray()) {
            if (!result.contains("" + each)) {
                result += each;
            }


        }
        return result;
    }


    public static int maxNumber(int[] arr) {

        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    public static int minNumber(int[] arr) {

        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }


    public static int[] reverse(int[] arr) {

        int[] res = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

            res[j] = arr[i];
        }
        return res;
    }


    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int k = 0;


        for (int each : arr1) {
            result[k] = each;
            k++;
        }
        for (int each : arr2) {
            result[k] = each;
            k++;
        }

        return result;
    }


}