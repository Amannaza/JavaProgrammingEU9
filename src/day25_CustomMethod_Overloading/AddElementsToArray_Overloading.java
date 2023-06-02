package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[]numbers={1,2,3,4,5,6};

        numbers=addElement(numbers,7); //7

        char[]chars={'A','B','C','D'}; //'E'

        chars=addElement(chars,'E');

        String[]names={"Ahmet","Oleksandr","Sinem","Cihad"}; //"Layan"

        names=addElement(names,"Layan");

        System.out.println("names = " + Arrays.toString(names));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("numbers = " + Arrays.toString(numbers));
    }



    //1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

    public static int[] addElement(int[] arr, int num) {
        int[] result = new int[arr.length + 1];
        int i = 0;
        for (int each : arr) {
            result[i++] = each;
        }
        result[i] = num;

        return result;
    }


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] arr, double num) {
        double[] result = new double[arr.length + 1];
        int j = 0;
        for (double each : arr) {
            result[j++] = each;
        }
        result[result.length - 1] = num;
        return result;
    }


    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] arr, String str) {

        String[] result = new String[arr.length + 1];
        int k = 0;
        for (String each : arr) {
            result[k++] = each;
        }
        result[result.length - 1] = str;
        return result;
    }

    //4. create a return method called addChar that can add a char after last index of a char array

    public static char[] addElement(char[] chars, char ch) {
        char[] result = new char[chars.length + 1];
        int i = 0;
        for (char each : chars) {
            result[i++] = each;
        }
        result[result.length - 1] = ch;
        return result;
    }

}
