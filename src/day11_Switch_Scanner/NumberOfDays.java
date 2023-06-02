package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 5;
        int year=2001;
        String result = "";

        if (number >= 1 && number <= 12) {

            switch (number) {


                case 2: if (year%4==0){
                    System.out.println("Month is 29 days");
                }else
                    result = "Month is february 28 days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "Month is 30 days";
                    break;
                /*case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:*/
                default: //1,3 ,5,7,8,10,12
                    result = "MONTH İS 31 DAYS";
                    break;
            }}else {
            result="invalid";


        }

        System.out.println(result);
    }
}
