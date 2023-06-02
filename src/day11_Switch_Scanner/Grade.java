package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {

        char ch = 'C';
        String result = "";

        switch (ch) {

            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'E':
                result = "failed";
                break;
            default:
                result = "İnvalid";

        }
        System.out.println(result);

    }
}
