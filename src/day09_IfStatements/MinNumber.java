package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

        int x=200;
        int y=134;
        boolean max1=x>y;
        boolean max2=y>x;
        boolean equal=x==y;

        if (max1){
            System.out.println(x+" is max number");
        }
        if (max2){
            System.out.println(y+" is max number");
        }
        if (equal){
            System.out.println("Numbers are equal and value is: "+x);}
    }
}
