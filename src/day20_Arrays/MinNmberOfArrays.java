package day20_Arrays;

public class MinNmberOfArrays {
    public static void main(String[] args) {

        int num[] = {4, 5, 21, 89, 44, 3, 5, 7};

        int min = num[0];

        for (int i = 0; i < num.length; i++) {

            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Min number=" + min);

    }
}
