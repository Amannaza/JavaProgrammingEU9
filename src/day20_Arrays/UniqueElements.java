package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#","C#", "Python", "Python","Aman","NAme","Ruhnama","Aman"};

        String unique = "";

        for (int i = 0; i < words.length; i++) {
            int frequency = 0;
            String element = words[i];


            for (int j = 0; j < words.length; j++) {

                if (words[j].equals(element)) {
                    frequency++;
                }

            }
            if (frequency == 1) {

                System.out.println(element);
            }


        }


    }
}
