package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "C#", "Python", "Python", "Aman", "NAme", "Ruhnama", "Aman"};


        for (String element : words) {
            int count=0;

            for (String each : words) {
                if (each.equals(element)){
                    count++;
                }
            }

            if (count==1){
                    System.out.println(element);

            }

        }


    }
}
