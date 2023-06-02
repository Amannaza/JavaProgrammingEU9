package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 3, 5, 6, 7, 6, 5};
        int[] result = removeDuplicate(arr);
        System.out.println(Arrays.toString(result));

        String[] words = {"Java", "Java", "Python", "Java"};

        words = removeDuplicate(words, "Java");

        System.out.println(Arrays.toString(words));

        System.out.println("----------------------");

        arr=Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr));
    }


    //remove dublicates elements, return new array
    public static int[] removeDuplicate(int[] array) {
        int[] result = {};
        for (int i = 0; i < array.length; i++) {

            if (!ArraysUtility.contains(result, array[i])) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }


    //remove dublicates elements, return new array
    public static double[] removeDuplicate(double[] array) {
        double[] result = {};
        for (int i = 0; i < array.length; i++) {

            if (!ArraysUtility.contains(result, array[i])) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }


    //remove dublicates elements, return new array
    public static char[] removeDuplicate(char[] array) {
        char[] result = {};
        for (int i = 0; i < array.length; i++) {

            if (!ArraysUtility.contains(result, array[i])) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }


    //remove dublicates elements, return new array
    public static String[] removeDuplicate(String[] array, String java) {
        String[] result = {};
        for (int i = 0; i < array.length; i++) {

            if (!ArraysUtility.contains(result, array[i])) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }
}