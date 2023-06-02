package day19_Loop_Practices;

public class TwiceDublicatedChar {
    public static void main(String[] args) {

String s="ABCDDEEEFFFGG";
String res="";

        for (int j = 0; j < s.length(); j++) {
            char c=s.charAt(j);
            int count=0;

            for (int i = 0; i <s.length() ; i++) {
                char each=s.charAt(i);
                if (each == c) {
                 count++;
                }
            }
        if (count==2){
            res+=c;
        }
        }
        System.out.println("Twice dublicated chars are : "+res);






    }
}
