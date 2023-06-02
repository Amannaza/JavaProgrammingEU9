package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int number = 6;

     String name=   (number == 1) ? "January" : (number == 2) ? "February" : (number ==3) ? "March" : (number ==4) ? "April" : (number ==5) ? "May" : (number ==6) ? "June" : (number ==7) ? "July" : (number ==8) ? "August" : (number ==9) ? "September" : (number ==10) ? "October" : (number ==11) ? "Novermber" :(number==12)? "December" : "İnvalid";

        System.out.println("name = " + name);

        System.out.println("-----------------------------------------------------");




    }
}
