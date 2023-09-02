package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {


        int[] numbers = {10, 5, 4, 20, 32, 0};

        int max = numbers[0];//10

        for (int i = 0; i < numbers.length; i++) {

            /*int each = numbers[i];
            if (each > max) {
                max = each;
            }*/
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println("Max number is=" + max);


    }
}
