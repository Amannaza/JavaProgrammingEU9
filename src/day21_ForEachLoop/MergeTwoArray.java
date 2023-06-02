package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

        int[] arr3 = new int[(arr1.length + arr2.length)];
        int j = 0;

       /* for (int k = 0,m=0; k <arr1.length ; k++,m++) {
            arr3[m]+=arr1[k];
        }

        for (int i = 0,j=arr1.length; i <arr2.length; i++,j++) {
            arr3[j]+=arr2[i];
        }*/

        for (int eachNumber : arr1) {
            arr3[j++] = eachNumber;
        }

        for (int eachNumber : arr2) {
            arr3[j++] = eachNumber;
        }

        System.out.println(Arrays.toString(arr3));
        System.out.println("-------------------------------------");


        String[] group1 = {"Ali", "Layan", "Aysenur"};
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String[] students = new String[group1.length + group2.length];

        int i = 0;

        for (String each : group1) {
            students[i++] = each;

        }
        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("----------------------------------------");


        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];
        int k = 0;

        for (char ch : ch1) {
            chars[k] = ch;
            k++;
        }

        for (char ch : ch2) {
            chars[k] = ch;
            k++;
        }

        System.out.println(Arrays.toString(chars));
    }
}
