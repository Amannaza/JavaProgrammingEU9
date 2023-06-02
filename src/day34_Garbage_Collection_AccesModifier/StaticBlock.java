package day34_Garbage_Collection_AccesModifier;

public class StaticBlock {

     public static void main(String[] args) {
          System.out.println("Main Method");
     }

     static {  //runs first before anything and running only one time
          System.out.println("Static Block 1");
     }

    static {
        System.out.println("Static Block 2");
    }

    static {
        System.out.println("Static Block 3");
    }



}
