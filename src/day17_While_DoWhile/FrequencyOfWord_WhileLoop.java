package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python";
        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "").trim();
            frequency++;

        }
        System.out.println(str);
        System.out.println(frequency);

        System.out.println("-------------------------------------- ");

        String sentence = " cat cat cat cat dog dog dog cat cat CAT Cat";
        sentence = sentence.toLowerCase();
        int countCat = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "").trim();
            countCat++;
        }


        System.out.println(sentence);
        System.out.println(countCat);

        System.out.println("------------------------------------------------");

        String s = "Java java java python Python pytHOn";

        s=s.toLowerCase();
        int countJava = 0;
        int countPython = 0;

        while ( s.contains("java")||s.contains("python")){

            if (s.contains("java")){
                s=s.toLowerCase().replaceFirst("java","");
                countJava++;
            }else {
                s=s.replaceFirst("python","");
                countPython++;
            }

        }
         System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);


    }

}
