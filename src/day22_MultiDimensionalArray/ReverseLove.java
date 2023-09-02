package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseLove {
    public static void main(String[] args) {

        String sentence = "I Love Java";                    // String
        String[] words = sentence.split(" ");         // .split(bolmek)----split and convert to array
        System.out.println(Arrays.toString(words));

        String reverse = "";
        int j = 0;

        for (int i = words[1].length() - 1; i >= 0; i--) {      //words[1]-this is not array.It is just String.Variable is String Array variable.

            reverse += words[1].charAt(i);
        }
        System.out.println(reverse);

/*
        sentence = sentence.replaceFirst   (words[1], reverse);         //1.Replace the first char of words-to reverse
        System.out.println(sentence);
*/

        words[1] = reverse;                                     //2.assign to fisrt char of array reverse
        System.out.println(Arrays.toString(words));

        String result = "";
        for (String word : words) {
            result += word + " ";
        }

        System.out.println(result);
    }
}

   /* Write a program that can reverse the second word of the sentence
			Ex:
                    sentence = "I Love Java";

                    output:
                    I evoL Java*/