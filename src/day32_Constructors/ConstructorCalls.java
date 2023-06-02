package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls() {
        //this();   --->cannot call or contain itself
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){

        this(); //Default Constructor
        System.out.println("Constructor with int argument");
        //this()--->when we call construcyot it has to be at the first step
    }

    public ConstructorCalls(String str){
        this(10);//Default Constructor,Constructor with int argument
        System.out.println("Constructor wit String argument");
    }


    public static void main(String[] args) {
        ConstructorCalls obj1=new ConstructorCalls();

        System.out.println("------------------------");

        ConstructorCalls obj2=new ConstructorCalls(10);

        System.out.println("------------------------");

        ConstructorCalls obj3=new ConstructorCalls("Java");

    }



}
