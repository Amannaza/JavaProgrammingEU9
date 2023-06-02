package day19_Loop_Practices;

public class IndexNumberOfDublicatedChar {
    public static void main(String[] args) {

        String str = "ABCDEEFFG";
        String result = "";

/*	3. Write a program that can display all the characters that appeared twice in the string.*/

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if (each == ch) {
                    count++;
                }
            }

            if (!(count > 1)) {
                continue;
            }
            result += ch;
            break;

        }
        System.out.println("First dublicated char is " + result + " from the word " + str + " and its frequence number is: " + str.indexOf(result));

    }
}
/*	2. Write a program that can return the index number of the first duplicated character from a string
 */