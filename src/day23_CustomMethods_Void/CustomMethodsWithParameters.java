package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        //oddOrEven(); //method demands additional information
        oddOrEven(13);

        System.out.println("-----------------------");

        ageOfPerson(1995);

        System.out.println("-----------------------");

        createNumbers(4, 15);

    }

    //create a function that can check even or  odd number
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    //create a function that can display age of the person
    public static void ageOfPerson(int birthYear) {
        int age = 2022 - birthYear;
        System.out.println("Your age is " + age);
    }

    //create a function that can print all the numbers between x and y
    public static void createNumbers(int x, int y) {
        for (int i = x; i < y; i++) {
            System.out.print(i + " ");
        }
    }


}
