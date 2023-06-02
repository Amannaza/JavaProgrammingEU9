package day09_IfStatements;

public class PassOrFail {
    public static void main(String[] args) {
        int score = 65;

        boolean result = score >= 60;
        if (result) {
            System.out.println("Congratulations,you passed!");
        } else {
            System.out.println("Failed");
        }


    }
}
