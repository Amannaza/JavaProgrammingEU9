package day37_Inheritance.phoneTask;public class PhoneShop {    public static void main(String[] args) {        Iphone iphone1 = new Iphone("XS Max", "6.7 inch", 1000, "Black");        Samsung samsung1 = new Samsung("galaxy s19", "6 inches", 900, "White");        Nokia nokia1 = new Nokia("Brick", "4 inches", 50, "Grey");        System.out.println(iphone1);        System.out.println(samsung1);        System.out.println(nokia1);        iphone1.call(758);        iphone1.text(7585453);        iphone1.faceTime(98347845);        iphone1.faceTime("@yahoo.com");        System.out.println("------------------------------");        samsung1.call(758);        samsung1.text(7585453);        samsung1.freeze();        System.out.println("------------------------------");        nokia1.call(758);        nokia1.text(7585453);        nokia1.selfDefence();        System.out.println("------------------------------");        System.out.println(Phone.hasBattery);        System.out.println(Iphone.hasBattery);        System.out.println(Samsung.hasBattery);        System.out.println(Nokia.hasBattery );    }}