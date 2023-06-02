package day18_Nested_Loop;

public class Shape {
    public static void main(String[] args) {


        for (int i = 0; i <10 ; i++) {

            for (int j = 0; j < 10; j++) {

                for (int k =0; k <=j ; k++) {

                   System.out.print("* ");
               }
                System.out.println();

            }

        }



    }
}
