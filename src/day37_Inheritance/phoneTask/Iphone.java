package day37_Inheritance.phoneTask;import day37_Inheritance.animalTask.Parrot;public class Iphone extends Phone {    public Iphone( String model, String size, double price, String color) {        super("Apple", model, size, price, color);    }    public void faceTime(long phoneNumber) {        System.out.println(model + " " + brand + " is having face time with phone number: " + phoneNumber);    }    public void faceTime(String email) {        System.out.println(model + " " + brand + " is having face time with email: " + email);    }}/*	1.2 Create a sub class of Phone named IPhone:				Variables:					brand, model, size, price, color				Methods:                    Constructor					call(long phoneNumber)					text(long phoneNumber)					faceTime(long phoneNumber)					faceTime(String email)					toString()*/