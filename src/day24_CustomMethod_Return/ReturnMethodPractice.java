package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {


//find the max number 100 and 200
        int maxNumber = max(100, 200);
        System.out.println(maxNumber);

//multiple the max number by 2

        int multiplicstion = maxNumber * 2;
        System.out.println(multiplicstion);

    }


    public static int max(int num1, int num2) {
        int max = 0;
        if (num1 > num2) {
            max = num1;
        } else if (num2 > num1) {
            max = num2;
        } else {
            max = num1 = num2;
        }
        return max;
    }


}