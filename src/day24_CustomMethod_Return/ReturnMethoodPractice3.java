package day24_CustomMethod_Return;

public class ReturnMethoodPractice3 {


    public static void main(String[] args) {

//
        String str = "aaabcccccddde";


        for (int i = 0; i < str.length(); i++) {
            int frequebcy = frequency(str, str.charAt(i));
            if (frequebcy == 1) {
                System.out.println(str.charAt(i));
            }
        }


    }

    public static int frequency(String str, char ch) {
        int count = 0;


        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

}
