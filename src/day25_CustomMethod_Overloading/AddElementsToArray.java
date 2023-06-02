package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4};
        int[] newarray = addInteger(arr, 5);
        System.out.println(Arrays.toString(newarray));

        double[] arrd = {3.1, 4.2, 5.4};
        double[] addedArray = addDouble(arrd, 5.6);
        System.out.println(Arrays.toString(addedArray));


        String[] arrS = {"Maya", "Mahmut", "Zahmet", "Rahmet"};
        String str = "Aman";
        String[] addedStringArray = addString(arrS, str);
        System.out.println(Arrays.toString(addedStringArray));


        char[] cha = {'A', 'C', 'D', 'H', 'J'};
        char ch = 'Z';
        char[] addedChar = addChar(cha, ch);
        System.out.println(Arrays.toString(addedChar));

    }

    /*        1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
            {1,2,3,4}, 5
            new array ==> {1,2,3,4,5}*/
    public static int[] addInteger(int[] arr, int num) {
        int[] result = new int[arr.length + 1];
        int i = 0;
        for (int each : arr) {
            result[i++] = each;
        }
        result[i] = num;

        return result;
    }


    //        2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDouble(double[] arr, double num) {
        double[] result = new double[arr.length + 1];
        int j = 0;
        for (double each : arr) {
            result[j++] = each;
        }
        result[result.length - 1] = num;
        return result;
    }


    //  3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addString(String[] arr, String str) {

        String[] result = new String[arr.length + 1];
        int k = 0;
        for (String each : arr) {
            result[k++] = each;
        }
        result[result.length - 1] = str;
        return result;
    }

    //   4. create a return method called addChar that can add a char after last index of a char array

    public static char[] addChar(char[] chars, char ch) {
        char[] result = new char[chars.length + 1];
        int i = 0;
        for (char each : chars) {
            result[i++] = each;
        }
        result[result.length - 1] = ch;
        return result;
    }


}
