package day20_Arrays;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {

        int[] numbers = {12, 21, 43, 61, 19, 24};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);//sorts array in ascending orde

        System.out.println(Arrays.toString(numbers));

    }
}
