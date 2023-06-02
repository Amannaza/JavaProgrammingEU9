package day15_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String str = input.next();

        String word = "";
        input.close();

        for (int i = str.length() - 1; i >= 0; i--) {

            word += str.charAt(i);
        }
        System.out.println(word);
    }
}
