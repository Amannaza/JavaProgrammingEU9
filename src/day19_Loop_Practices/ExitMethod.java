package day19_Loop_Practices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {  // i=0 ,1 ,2 ,3 ,4 ,5

            if (i==3){
             //     break;  //Terminates the loop
             //      continue;   //Terminates the current iteration
            System.exit(0); //Terminates the program
            }
            System.out.println(i);

        }
        System.out.println("Wooden Spoon");


    }
}
