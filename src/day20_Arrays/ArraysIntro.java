package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create variable that‘s capable enough to contain 5 names

        String[] myGroups = new String[5]; //0~4
        myGroups[0] = "Gunay";
        myGroups[1] = "Neira";
        myGroups[2] = "Suat";
        myGroups[3] = "Hulya";
        myGroups[4] = "Mikael";

        // myGroups[5]="Muhtar";
        //myGroups[-1]="Adam";


        // System.out.println(myGroups); //hash code error -----> ([Ljava.lang.String;@3f0ee7cb)
        System.out.println(Arrays.toString(myGroups));  //["Gunay","Neira","Suat","Hulya","Mikael"]

        System.out.println("------------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thirsday", "Friday", "Saturday", "Sunday"};
        //       index:     0        1           2          3        4         5         6

        int number = 3;

        if (number > 7 || number < 1) {
            System.err.println("Invalid number of date");
            System.exit(0);
        }


        System.out.println(days[number - 1]);

        System.out.println("----------------------------------------------------------");


        String[] month = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        int num = 12;
        if (num > 12 || num < 1) {

            System.err.println("Invalid month order");
            System.exit(0);
        }
        System.out.println(month[num - 1]);
    }
}
