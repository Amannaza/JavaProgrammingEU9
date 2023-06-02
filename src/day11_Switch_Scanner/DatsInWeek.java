package day11_Switch_Scanner;

public class DatsInWeek {
    public static void main(String[] args) {
       // long number = 9l,
       //  float number = 7f;
       //  double number = 9D;
       //  boolean number = true;
       int number = 7;

        switch (number) {//1,2,3,4,5,6,7

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedbesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("İnvalid Date Number");

        }
    }

}
