package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26]; //A~Z

       /* letters[0] = 'A';
        letters[1]='B';
        ......*/


        /*for (char i = 'A', j = 0; i < 'Z' && j < letters.length; i++, j++) {
            letters[j] = i;
        }*/


       /* for (int i = 0 ,j='A'; i < letters.length; i++,j++) {   //i:index number 0~last index
            letters[i]=(char) j;
        }*/


        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {

//          letters[i]=ch++;
            letters[i] = ch;

        }

        System.out.println(Arrays.toString(letters));


        System.out.println("-----------------------------------------");

//   Z~A alphabet in array

        char[] alphabet = new char[26];

        for (char k = 'Z', l = 0; l < alphabet.length; k--, l++) {
            alphabet[l] = k;
        }


        /*for (int i=0,j='Z';i<alphabet.length&&j>='A';i++,j--) {
            alphabet[i] = (char) j;
        }*/


      /*  char c='Z';
        for (int i = 0; i <alphabet.length ; i++,c--) {
            alphabet[i]=c;

        }*/

        System.out.println(Arrays.toString(alphabet));


    }
}
