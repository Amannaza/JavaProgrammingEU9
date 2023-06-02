package day07_Oparators;

public class Castings {
    public static void main(String[] args) {

        float avarageScore = 20.5f;

        byte num1 = (byte) avarageScore;    //explicit casting
        short num2 = (short) avarageScore; //explicit casting
        int num3 = (int) avarageScore;     //explicit casting
        long num4 = (long) avarageScore;   //explicit casting
        float num5 = avarageScore;        //no casting
        double num6 = avarageScore;       //implicit casting---->Casting smaller type to larger type

        System.out.println("byte = " + num1);
        System.out.println("short = " + num2);
        System.out.println("int = " + num3);
        System.out.println("long = " + num4);
        System.out.println("float = " + num5);
        System.out.println("double= " + num6);


    }
}
