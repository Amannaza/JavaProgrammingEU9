package day19_Loop_Practices;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aabccd";
        String result = "";//a2b1c2d1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //each character of the srtring
            int count = 0;

            for (int i = 0; i < str.length(); i++) {//to find the frequency of character

                char each = str.charAt(i);

                if (each == ch) {
                    count++;
                }


            }
            if (result.contains(ch + "")) {
                continue;
            }

            result += ch;
            result += count;
        }


        System.out.println(result);
    }
}
/*	1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1*/