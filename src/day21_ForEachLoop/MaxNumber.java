package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {


        int[] numbers = {10, 5, 4, 20, 32, 0};

        int max = numbers[0];//10


        for (int each : numbers) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println("Max number is=" + max);


    }
}
