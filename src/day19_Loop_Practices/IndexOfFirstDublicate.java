package day19_Loop_Practices;

public class IndexOfFirstDublicate {
    public static void main(String[] args) {

        String st="AABBCCDDEEFG";
        String result="";

        /*	4. Write a program that can return the index number of the first unique character.*/

        for (int j = 0; j <st.length() ; j++) {

            char ch=st.charAt(j);
            int count=0;

            for (int i = 0; i <st.length() ; i++) {
                char each=st.charAt(i);
            if (each==ch){
                count++;
            }
            }
        if (count==1){
            result+=""+ch;
            break;
        }

        }

        System.out.println("Given word:"+st);
        System.out.println("First unique char:"+result);
        System.out.println("Index number of first unique char is:"+st.indexOf(result));





    }
}
