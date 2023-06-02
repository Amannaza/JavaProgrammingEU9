package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        //radius,diameter,circumference,area
        int radius=43;
        int diameter=2*radius;
        double PI=3.14;

        double area=PI*radius*radius;
        double circumference=2*PI*radius;

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("PI = " + PI);
        System.out.println("circumference = " + circumference);
        System.out.println("area = " + area);
    }
}
