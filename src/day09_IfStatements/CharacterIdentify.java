package day09_IfStatements;

public class CharacterIdentify {
    public static void main(String[] args) {
       /* Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

        Ex:
        ch = '@'

        output:
        Special Character

        HINT: You may wanna check out the numbers of the chracters on ASCII table */

        char x = 'e';

        boolean capLet = x >= 65 && x <= 90;
        boolean smallLet = x >= 97 && x <= 122;
        boolean numbers = x >= 48 && x <= 57;
        if (capLet) {
            System.out.println("Capital Letter : " + x);
        } else if (smallLet) {
            System.out.println("Small Letter : " + x);

        } else if (numbers) {
            System.out.println("Digit number : " + x);

        } else {
            System.out.println("Special Character");

        }
        System.out.println("------------------------------------------------");

        char ch = '@';
         
        if (ch >= '0' && ch <= '9') {

            System.out.println("Digit number : " + ch);

        } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {

            System.out.println("Alphabetic : " + ch);

        } else {
            System.out.println("Special Character : " + ch);
        }


    }

}
