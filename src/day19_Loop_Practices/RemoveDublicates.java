package day19_Loop_Practices;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "AABBCC";

        String result = "";//ABC

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);   //"A","A","B","B","C","C"

            if (result.contains("" + eachChar)) {//if the result already contains character
                continue;//skips
            }
            result += eachChar;
        }


        System.out.println(result);
    }
}
