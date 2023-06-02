package day10_NestedIf;

public class TernariesInfo {
    public static void main(String[] args) {
        int n = 11;

        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("---------------------------------");

        String result1 = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println("result1 = " + result1);

        System.out.println("---------------------------------");

        int age = 56;

     /*   if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }*/

        //  System.out.println((age >= 21) ? ("Eligible" : "Not Eligible");

        String result2 = (age >= 21) ? "Eligible" : "Not Eligible";
        System.out.println("result2 = " + result2);

        System.out.println("--------------------------------------------------------");

        int number = 100;

       /* if (number>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");
        } else{
            System.out.println("zero");
        }*/

       String result3= (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println("result3 = " + result3);





    }



}
