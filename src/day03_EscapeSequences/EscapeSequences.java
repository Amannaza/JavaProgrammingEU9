package day03_EscapeSequences;
/*Escape sequences must be given with double quote
\n:starts a new line
\t:(tab)
\\:Single back slash on console
\":double quote
 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java\nPython\nC#");
        System.out.println("____________________");
        System.out.println("Hello Cydeo \nHow are you today \nİt's nice to see you \nWhat class we do next week?");
        System.out.println("____________________");
        System.out.println("\tJava is cool Programming");
        System.out.println("____________________");
        System.out.println("\\"); // in order to print one backward slash we need to give two back slahes
        System.out.println("____________________");
        System.out.println("My favorite tv show is \" Game Of Thrones\"");
    }
}
