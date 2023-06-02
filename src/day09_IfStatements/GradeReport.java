package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

        int b=4;
        char grade = 0;
        if (b==5){
            System.out.println("A" );
        } else if (b==4) {
            System.out.println("B");
        }else if (b==3) {
            System.out.println("C");
        }else if (b==2) {
            System.out.println("D");
        }else  {
            System.out.println("F");
        }
        System.out.println("----------------------------------");

        if (b==5){
            grade='A';
        } else if (b==4) {
            grade='B';
        }else if (b==3) {
            grade='C';
        }else if (b==2) {
            grade='D';
        }else if (b==1) {
            grade='E';
        }
        System.out.println("grade = " + grade);
    }
}