package day06_PrimitiveTypeCastings;

public class ArithmaticOparators {
    public static void main(String[] args) {

        System.out.println("121" + 1); //1211----->Concatenation

        System.out.println(20 + 30);  //addition
        System.out.println(100 - 50); //subtraction
        System.out.println(10 * 5); //multiplication

        System.out.println(10 / 4); //Two of intger so result will be integer number 2
        System.out.println(100 / 3); // integer/intger=result would be integer

        System.out.println(100.00 / 3);
        System.out.println((double) 100 / 3); //  It means 100 is double number
        System.out.println(100 / 3.0);
        System.out.println(100d / 3); //100 is decimal

        int a = 100;

        double b = a / 6; //16.0
        System.out.println("b = " + b);


        double c = a / 6.0;
        double d = (double) a / 6;
        double e = 100/ 6d;
        double f=100D/6;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);}
}
