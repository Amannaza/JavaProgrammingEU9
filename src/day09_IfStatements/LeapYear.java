package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {
        int year=2006;
        boolean leapYear=year%2==0;
        if (leapYear){
            System.out.println(year+" is leap year");
        }
else {
            System.out.println("Not leap year");
        }


    }
}
