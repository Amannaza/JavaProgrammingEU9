package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {


        String word = "Cydeo";

        //index:   01234

        char thirdCharacter = word.charAt(2);

        System.out.println("Third character is : " + thirdCharacter);

        /*char tenthCharacter=word.charAt(9);
        System.out.println("tenthCharacter = " + tenthCharacter);
*/
        System.out.println("-------------------------------------------");

        String s1 = "Batch 25 is the best batch.Java Programming Language";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length() - 1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("-------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();

        System.out.println(str);

        // Today is great day to learn Java programming language.
        String sentence="Today is great day to learn Java programming language.";
        sentence=sentence.toUpperCase();
        System.out.println(sentence);

    }
}
