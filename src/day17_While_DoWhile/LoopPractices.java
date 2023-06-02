package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {//Best way for exact repetition
            System.out.println(i);
        }
        System.out.println("-------------------");

        int a = 1;

        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        System.out.println("--------------------");

        int k = 1;

        do {
            System.out.println(k);
            k++;
        } while (k <= 10);

    }
}
