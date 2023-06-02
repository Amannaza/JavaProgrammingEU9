package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {
    public static void main(String[] args) {
        int num = 10;
        String result = "";

        //PRE-CONDİTİON:İf there is only one statement in the block.But you should never do it
        if (num == 1)
            result = "January";
         else if (num == 2)
            result = "February";

         else if (num == 3)
            result = "March";

         else if (num == 4)
            result = "April";

         else if (num == 5)
            result = "May";

         else if (num == 6)
            result = "June";

         else if (num == 7)
            result = "July";

         else if (num == 8)
            result = "August";

         else if (num == 9)
            result = "September";

        else if (num == 10)
            result = "October";

         else if (num == 11)
            result = "November";

         else
            result = "December";


        System.out.println("result = " + result);

    }
}
