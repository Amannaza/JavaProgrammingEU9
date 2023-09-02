package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }


    //prints each double of a double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }


    //prints each char of a char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }


    //prints each String of a String array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    //returns the maximum number from integer array
    public static int maxNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //returns the maximum number from double array
    public static double maxNumber(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //returns the min number from integer array
    public static int minNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


    //returns the min number from double array
    public static double minNumber(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


    //checks if the given integer is contained in  the given array,return boolean,contains(int[],int)
    public static boolean contains(int[] array, int element) {
        //                  {1,2,3,4},  6
        boolean result = false;

        for (int each : array) {
            if (each == element) {  //if any array's element 's matching witng with given element,it means given element is contains in the array
                result = true;
            }
        }
        return result;
    }

    //checks if the given double is contained in  the given array,return boolean
    public static boolean contains(double[] array, double element) {
        //                  {1.5,2.6,3.6,4.8},  6.1
        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //checks if the given String is contained in  the given array,return boolean
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }


    //checks if the given char is contained in  the given array,return boolean
    public static boolean contains(char[] array, char element) {

        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //adds the integer given element to array,returns a new array
    public static int[] addElement(int[] arr, int num) {
        int[] result = new int[arr.length + 1];
        int i = 0;
        for (int each : arr) {
            result[i++] = each;
        }
        result[i] = num;

        return result;
    }


    //adds the double given element to array,returns a new array
    public static double[] addElement(double[] arr, double num) {
        double[] result = new double[arr.length + 1];
        int j = 0;
        for (double each : arr) {
            result[j++] = each;
        }
        result[result.length - 1] = num;
        return result;
    }


    //adds the String given element to array,returns a new array
    public static String[] addElement(String[] arr, String str) {

        String[] result = new String[arr.length + 1];
        int k = 0;
        for (String each : arr) {
            result[k++] = each;
        }
        result[result.length - 1] = str;
        return result;
    }


    //adds the char given element to array,returns a new array
    public static char[] addElement(char[] chars, char ch) {
        char[] result = new char[chars.length + 1];
        int i = 0;
        for (char each : chars) {
            result[i++] = each;
        }
        result[result.length - 1] = ch;
        return result;
    }


    //returns the frequence of the given int element from the given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    //returns the frequence of the given double element from the given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //returns the frequence of the given char element from the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //returns the frequence of the given String element from the given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }


    //returns the unique elements of array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {}; //new int[0]

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is 1 than element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    //returns the unique elements of array as a new array
    public static double[] uniqueElements(double[] array) {
        double[] result = {}; //new int[0]

        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is 1 than element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    //returns the unique elements of array as a new array
    public static char[] uniqueElements(char[] array) {
        char[] result = {}; //new int[0]

        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is 1 than element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    //returns the unique elements of array as a new array
    public static String[] uniqueElements(String[] array) {
        String[] result = {}; //new int[0]

        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is 1 than element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    //remove with the index from the array, returns new array again
    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index : " + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (index == i) {     //if the element of array is matching with given index
                continue;             //skip
            }
            result[j++] = array[i];
        }
        return result;
    }


    //remove with the index from the array, returns new array again
    public static double[] removeElement(double[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index : " + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (index == i) {     //if the element of array is matching with given index
                continue;             //skip
            }
            result[j++] = array[i];
        }
        return result;
    }


    //remove with the index from the array, returns new array again
    public static char[] removeElement(char[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index : " + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (index == i) {     //if the element of array is matching with given index
                continue;             //skip
            }
            result[j++] = array[i];
        }
        return result;
    }


    //remove with the index from the array, returns new array again
    public static String[] removeElement(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index : " + index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (index == i) {     //if the element of array is matching with given index
                continue;             //skip
            }
            result[j++] = array[i];
        }
        return result;
    }


    //merges given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    //merges given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    //merges given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    //merges given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    //reverse the array,returns a new array
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }


    //reverse the array,returns a new array
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }


    //reverse the array,returns a new array
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }


    //reverse the array,returns a new array
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }


    //remove duplicated elements, return new array
    public static int[] removeDuplicate(int[] array) {
        int[] result = {};
        for (int i = 0; i < array.length; i++) {

            if (!ArraysUtility.contains(result, array[i])) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }


    //remove duplicated elements, return new array
    public static double[] removeDuplicate(double[] array) {
        double[] result = {};
        for (int i = 0; i < array.length; i++) {

            if (!ArraysUtility.contains(result, array[i])) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }


    //remove duplicated elements, return new array
    public static char[] removeDuplicate(char[] array) {
        char[] result = {};
        for (int i = 0; i < array.length; i++) {

            if (!ArraysUtility.contains(result, array[i])) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }


    //remove duplicated elements, return new array
    public static String[] removeDuplicate(String[] array) {
        String[] result = {};
        for (int i = 0; i < array.length; i++) {

            if (!ArraysUtility.contains(result, array[i])) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }


    //replace the element of the array at the given index with the new element
    public static int[] replace(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index : " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }


    //replace the element of the array at the given index with the new element
    public static double[] replace(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index : " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }


    //replace the element of the array at the given index with the new element
    public static char[] replace(char[] array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index : " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }


    //replace the element of the array at the given index with the new element
    public static String[] replace(String[] array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index : " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }


    //replace all matching old value with new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }


    //replace all matching old value with new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }


    //replace all matching old value with new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }


    //replace all matching old value with new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }
        }
        return array;
    }


    //swap two element of array according given index number,return new array
    public static int[] swap(int[] arr, int i, int j) {

        if (i < 0 || j < 0 || i > arr.length - 1 || j > arr.length - 1) {
            System.out.println("Invalid index number ");
            System.exit(0);
        }
        int n1 = arr[i];
        arr[i] = arr[j];
        arr[j] = n1;

        return arr;
    }


    //swap two element of array according given index number,return new array
    public static double[] swap(double[] arr, int i, int j) {

        if (i < 0 || j < 0 || i > arr.length - 1 || j > arr.length - 1) {
            System.out.println("Invalid index number ");
            System.exit(0);
        }
        double n1 = arr[i];
        arr[i] = arr[j];
        arr[j] = n1;

        return arr;
    }


    //swap two element of array according given index number,return new array
    public static char[] swap(char[] arr, int i, int j) {

        if (i < 0 || j < 0 || i > arr.length - 1 || j > arr.length - 1) {
            System.out.println("Invalid index number ");
            System.exit(0);
        }
        char n1 = arr[i];
        arr[i] = arr[j];
        arr[j] = n1;

        return arr;
    }


    //swap two element of array according given index number,return new array
    public static String[] swap(String[] arr, int i, int j) {

        if (i < 0 || j < 0 || i > arr.length - 1 || j > arr.length - 1) {
            System.out.println("Invalid index number ");
            System.exit(0);
        }
        String n1 = arr[i];
        arr[i] = arr[j];
        arr[j] = n1;

        return arr;
    }


    //insert index of array with newElement,return new array
    public static int[] insert(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index number");
            System.exit(0);
        }

        int[] result = new int[array.length + 1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {

            result[j++] = array[i];

            if (i == index) {
                result[j++] = newElement;
            }
        }
        return result;
    }


    //insert index of array with newElement,return new array
    public static double[] insert(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index number");
            System.exit(0);
        }

        double[] result = new double[array.length + 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            result[j++] = array[i];
            if (i == index) {
                result[j++] = newElement;
            }
        }
        return result;
    }


    //insert index of array with newElement,return new array
    public static char[] insert(char[] array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index number");
            System.exit(0);
        }

        char[] result = new char[array.length + 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            result[j++] = array[i];
            if (i == index) {
                result[j++] = newElement;
            }
        }
        return result;
    }


    //insert index of array with newElement,return new array
    public static String[] insert(String[] array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index number");
            System.exit(0);
        }

        String[] result = new String[array.length + 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            result[j++] = array[i];
            if (i == index) {
                result[j++] = newElement;
            }
        }
        return result;
    }

}
