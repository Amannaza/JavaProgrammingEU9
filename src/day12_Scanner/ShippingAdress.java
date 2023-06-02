package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String name = input.nextLine();

        System.out.println("Building number:");
        int buildNumber = input.nextInt();

        input.nextLine();
        System.out.println("Street name:");
        String streetName = input.nextLine();

        System.out.println("City name:");
        String cityName = input.nextLine();

        System.out.println("State name:");
        String stateName = input.next();

        System.out.println("Zipcode :");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Country : ");
        String country=input.nextLine();

        input.close();          //EnterEnter

        System.out.println("Fullname: "+name);
        System.out.println("Building Number = " + buildNumber);
        System.out.println("Street number"+streetName);
        System.out.println("Street name:"+streetName);
        System.out.println("City name:"+cityName);
        System.out.println("State name:"+stateName);
        System.out.println("ZiCode : "+zipCode);




    }
}
