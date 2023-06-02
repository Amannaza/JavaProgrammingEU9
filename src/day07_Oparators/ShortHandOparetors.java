package day07_Oparators;

public class ShortHandOparetors {
    public static void main(String[] args) {
        //assightment: =
        int number = 100;
        System.out.println("number = " + number); // 100

        number = 200;
        System.out.println("number = " + number);  //200

        String world = "Java Programming";
        System.out.println("world = " + world);  //Java Programming

        world = "Wooden Spoon";
        System.out.println("world = " + world);  //Wooden Spoon

        world = "Cydeo";
        System.out.println("world = " + world);  //Cydeo

        //world=123;
        //world="123"+1;
        world = "Java Programming";
        System.out.println("world = " + world);

        System.out.println("----------------------");

        /* Addition assignment: */

        int x = 100;
        System.out.println("x = " + x);

        System.out.println(x + 200);  //300

        //x=x+200;
        x += 200;
        System.out.println("x = " + x);

        String str = "Wooden ";
        str += "Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);  //2.5

        num1 += 5.5;
        System.out.println("num1 = " + num1);  //8.0


        double availableBalance = 1000.50;
        //deposit 300$
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("----------------------------");

        //withdrawing 500$

        availableBalance -= 500;  //availableBalance=1300.50-500
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200$,depositing 400$

        availableBalance -= 200;
        availableBalance += 400;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("--------------------------------");

        double salary = 50_000.50;
        System.out.println("salary = " + salary);

        salary *= 2;
        System.out.println("salary = " + salary);

        double doge = 0.00000010;
        System.out.println("doge = " + doge);

        doge *= 100000;

        System.out.println("doge = " + doge);

        System.out.println("-------------------");

        double num2 = 25000;
        // num2=num2 /2 ;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("----------------------");
        double num3 = 100;

        //%

        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("------------------------");

        int amount = 127; //cents

        int quarters = 127 / 25;
        int cents = 127 % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("-------------------------");

         int cents2=127;

         cents2 %=25;
        System.out.println("cents2 = " + cents2);

        System.out.println("---------------------------");

        int y=300;

        y %=16;

        System.out.println("y = " + y);

        System.out.println("----------------------------");

        int balance=3500;
        //insurance fee=$153

        balance %=153;

        System.out.println("balance = " + balance);



    }
}
