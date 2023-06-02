package day15_ForLoop;

public class Alphabets {
    public static void main(String[] args) {

        //print A~Z
        for (char i='A';i<='Z';i++){            // (int i=65;i<=90;i++)
            System.out.print(i+" ");            //System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------");

        //print Z~A
        for (char i='Z';i>='A';i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------------------");

        //print a~z
        for (char i='a';i<='z';i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------------------");

        //print z~a
        for (char i='z';i>='a';i--){
            System.out.print(i+" ");
        }
        System.out.println();

        //print all first 40000 character

        for (char i=1;i<=40000;i++)
            System.out.print(i+"");

        //char c='Ầ';
    }
}
