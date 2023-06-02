package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10047;
        int b = 2087;
        int c = 158759;
        //one must be max,onee must be min,one must be median number

        boolean aIsMedian = a > b && a < c || a > c && a < c;
        boolean bIsMedian = b > c && b < a || b > a && b < c;
        // boolean cIsMedian = c > a && c < b || c > b && c < a;
        boolean cIsMedian = !bIsMedian && !aIsMedian;

       /* System.out.println("is_a_Boolean = " + aIsMedian);
        System.out.println("is_b_Boolean = " + bIsMedian);
        System.out.println("is_c_Boolean = " + cIsMedian);*/
        if (aIsMedian) {
            System.out.println(a+" :a is Median number");
        }
        if (bIsMedian) {
            System.out.println(b+" :b is Median number");
        }
        if (cIsMedian) {
            System.out.println(c+" :c is Median number");
        }
    }
}
