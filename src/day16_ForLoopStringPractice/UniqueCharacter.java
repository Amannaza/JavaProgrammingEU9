package day16_ForLoopStringPractice;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str="aaabcBcce";

        String result="";

        for (int i = 0; i <str.length() ; i++) {

            char ch=str.charAt(i);

//            String ch=""+str.charAt(i);
//            String lastIndex= ""+ str.lastIndexOf(ch);
//            String firstIndex = "" + str.indexOf(ch);
//            if (lastIndex.equalsIgnoreCase(firstIndex))

            if (str.indexOf(ch)==str.lastIndexOf(ch))
            {
                result+=ch;
            }


        }

        System.out.println(result);




    }
}
