package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

                int grade=input.nextInt();
                String result="";
                input.close();

                if (grade>=0&&grade<=49){
                    result="F";
                }else if (grade>=50&&grade<=59){
                    result="E";
                } else if (grade>=60&&grade<=69) {
                    result="D";
                }else if (grade>=70&&grade<=79) {
                    result="C";
                }else if (grade>=80&&grade<=89) {
                    result="B";
                }else if (grade>=90&&grade<=100) {
                    result="A";
                }else {
                    result="Invalid Score";
                }
        System.out.println(result);


    }

}
