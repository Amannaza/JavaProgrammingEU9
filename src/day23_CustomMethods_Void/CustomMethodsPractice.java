package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        helloWord5Times();

        System.out.println("----------------------");

        helloCydeo5Times();

        System.out.println("----------------------");

        evenNumbers();

    }


    //create the function that can print "Hello Word" 5 times==>helloWord5Times()
    public static void helloWord5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Word!");

        }
    }

    //create a function that can create Hello Cydeo 5 times==>helloCydeo5Times
    public static void helloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }

    //create a function that can print all the even numbers 1~10==>evenNumber
    public static void evenNumbers() {
        for (int i = 2; i < 11; i += 2) {
            System.out.println(i);
        }

    }
}
