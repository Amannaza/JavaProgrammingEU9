package day28_ArrayList;

import java.util.ArrayList;

public class ArraylistMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        /*int num=1;
        list.remove(num);     //remove 1 index number which is 200==>Becouse of primitive data
        System.out.println(list);       //[100, 200, 200, 300, 400, 500]
        */

        Integer num = 2000;  //remove first 200==>Becouse non-primitive data
        //list.remove(200)--->removing 200'th index
        boolean r = list.remove(num);
        list.remove(num);   //removing 200

        System.out.println(list);
        System.out.println(r);

        System.out.println("-----------------------------------------------");

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());

        System.out.println(list);

        System.out.println("-----------------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');            //0
        int b = characters.lastIndexOf('A');     //4

        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------------------------------");

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

    }

}
