package day14_String;

import java.util.Scanner;

public class emailDomain_Substring {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*System.out.println("Enter your email addres");
        String email = input.next();
        input.close();*/

        String email="Cydeo.School@gmail.com";

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println("domain = " + domain);

        System.out.println("--------------------------------------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";
        //             0123456789


        String s1=str1.substring(0,10+1);   //Java is fun

        int beg=str1.indexOf(" J")+1;
        int end=str1.lastIndexOf(",");

        String s2=str1.substring(beg,end);

        String s3=str1.substring(str1.lastIndexOf("I"));

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}
