package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        String str="I love Java,Java is fun programming language";

        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);

        }
        System.out.println(result);



    }
}
