package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
        int year=1999;
        String make="Toyota";
        String model="Camry";
        int miles=4500;
        String colar="Blue";
        String price = "$15000";

        String sellCar=model+" "+make+" "+model+", "+miles+", "+colar+", "+price+".";
        System.out.println("sellCar = " + sellCar);


    }
}
