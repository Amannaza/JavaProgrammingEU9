package day33_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public double price = 1000;

    public static String OS = "IOS";

    public String color;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasCamera = true;

    public static boolean hasFaceTime = true;


    public static void operatingSystem() {
        System.out.println(OS);
    }

   /* public static void printModelAndPrice{
        System.out.println(model+" : "+price ); //static does not except instances
    }*/

    public void method() {
        System.out.println(model + " : " + price);
        System.out.println(OS);
    }


}
