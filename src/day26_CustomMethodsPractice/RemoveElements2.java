package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {

    public static void main(String[] args) {//Same example different solutions with RemoveElements2


        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = removeElement(numbers, 1);//{100,300,400,500,600}

        numbers = removeElement(numbers, 1);//{100,400,500,600}

        System.out.println(Arrays.toString(numbers));
    }

    //remove the index from the array, returns new array again
    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index : " + index);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) { //i:array's index number
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }


    //remove the index from the array, returns new array again
    public static double[] removeElement(double[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index : " + index);
        }

        double[] result = {};

        for (int i = 0; i < array.length; i++) { //i:array's index number
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }


    //remove the index from the array, returns new array again
    public static char [] removeElement(char[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index : " + index);
        }

        char[] result = {};

        for (int i = 0; i < array.length; i++) { //i:array's index number
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }


    //remove the index from the array, returns new array again
    public static String [] removeElement(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index : " + index);
        }

        String[] result = {};

        for (int i = 0; i < array.length; i++) { //i:array's index number
            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }



}
