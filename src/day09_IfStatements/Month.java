package day09_IfStatements;

public class Month {
    public static void main(String[] args) {
        int n = 10;

        if (n == 1) {
            System.out.println("January");
        } else if (n == 2) {
            System.out.println("February");

        } else if (n == 3) {
            System.out.println("March");

        } else if (n == 4) {
            System.out.println("April");

        } else if (n == 5) {
            System.out.println("May");

        } else if (n == 6) {
            System.out.println("June");

        } else if (n == 7) {
            System.out.println("July");

        } else if (n == 8) {
            System.out.println("August");

        } else if (n == 9) {
            System.out.println("September");

        } else if (n == 10) {
            System.out.println("October");

        } else if (n == 11) {
            System.out.println("November");

        } else if (n == 12) {
            System.out.println("December");

        }
        System.out.println("----------------------------------------------------------");

        String day = "";

        if (n==1){
            day="January";
        } else if (n==2) { day="February";

        }else if (n==3) { day="March";

        }else if (n==4) { day="April";

        }else if (n==5) { day="May";

        }else if (n==6) { day="June";

        }else if (n==7) { day="July";

        }else if (n==8) { day="August";

        }else if (n==9) { day="September";

        }else if (n==10) { day="October";

        }else if (n==11) { day="November";

        }else if (n==12) { day="December";

        }
        System.out.println("Month : " + day);

    }
}
