package day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Will you marry me?(yes/no)");
        String answer = input.next();

while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
    System.out.println("Invalid,please re-enter:");
    answer = input.next();
}

if(answer.equalsIgnoreCase("yes")){
    System.out.println("Congratulatons");
}else {
    System.out.println("Good bye");
}


    }
}
