package day19_Loop_Practices;

public class DublicatedFirstCharacter {
    public static void main(String[] args) {

        String str = "abcddddeeeee";
        String res = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);

                if (ch == each) {
                    count++;
                }
            }

            if (count > 1) {
                res += "" + ch;
                break;
            }

        }

        System.out.println("First dublicated number of " + str + " word is " + res);

        /*	1. Write a program that can return the first duplicated character from a string
         */
    }
}
