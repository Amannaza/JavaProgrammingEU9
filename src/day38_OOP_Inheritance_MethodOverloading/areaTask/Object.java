package day38_OOP_Inheritance_MethodOverloading.areaTask;public class Object {    public static void main(String[] args) {        Shape shape1 = new Shape("Circle");        System.out.println(shape1);        Circle circle = new Circle("Yay", 5);        System.out.println(circle.area());        System.out.println(circle.perimeter());        System.out.println(circle);        System.out.println("------------------------------------------------------------");        Square square = new Square("kare", 7);        System.out.println(square);        System.out.println("------------------------------------------------------------");        Rectangle rectangle = new Rectangle("star", 5, 7);        System.out.println(rectangle);    }}