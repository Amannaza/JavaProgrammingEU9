package day28_ArrayList;

import java.util.ArrayList;

public class ArraylistMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);    //0
        numbers.add(20);    //1
        numbers.add(30);    //3
        numbers.add(40);    //4
        numbers.add(50);    //6
        numbers.add(60);    //7

        numbers.add(2, 25);  //index:2--->25
        numbers.add(5, 45);  //5

        System.out.println(numbers);


        System.out.println(numbers.size());

        int lastIndex = numbers.size() - 1;

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3); //unboxing

        System.out.println("num = " + num);


        System.out.println("---------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("---------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "Java Script");  //replaces the element at the given index with the new element.
        list.set(3, "C++");      //replace
        System.out.println(list);

        System.out.println("-----------------------------");

        ArrayList<String> employers = new ArrayList<>();

        employers.add("Suat");
        employers.add("Aygun");
        employers.add("Olga");
        employers.add("Neira");
        employers.add("Ali");
        employers.add("Hulya");
        employers.add("Kaloyan");

        System.out.println(employers);   //[Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan]


        employers.remove(0);       //remove the element at the given index

        System.out.println(employers);   //Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employers.remove(0);

        System.out.println(employers);   //[Olga, Neira, Ali, Hulya, Kaloyan]

        employers.remove(0);

        System.out.println(employers);    //[Neira, Ali, Hulya, Kaloyan]

        employers.remove(1);

        System.out.println(employers);    //[Neira, Hulya, Kaloyan]

        employers.remove(employers.size() - 1);

        System.out.println(employers);    //[Neira, Hulya]

        boolean r1 = employers.remove("Hulya");

        System.out.println(employers);      //[Neira]

        boolean r2 = employers.remove("Neira");

        System.out.println(employers);      // []


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        
        
        System.out.println("-----------------------------");


    }


}
