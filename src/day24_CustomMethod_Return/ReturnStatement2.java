package day24_CustomMethod_Return;

public class ReturnStatement2 {


    public static void main(String[] args) {


    nameOfMonth(12 );


    }



    public static void nameOfMonth(int number) {


        if (number < 1 || number > 12) {
            System.out.println("Invalid");
            return;
        }


        String nameMonth = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June"
                : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "Semtember" : (number == 10) ? "October" : (number == 11) ? "November" : "December";

        System.out.println("nameMonth = " + nameMonth);
    }


}