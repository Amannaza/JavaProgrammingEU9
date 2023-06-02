package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensioanalArrayIntro {
    public static void main(String[] args) {

        String[] group1 = {"Joes", "Jone", "James"};
        String[] group2 = {"Muro", "Muri", "Macos"};
        String[] group3 = {"Aoran", "Anori", "Aqua"};

        String[][] groups = new String[3][]; //0,1,2

        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        //  System.out.println(Arrays.toString(groups));    //hashCode:toString method is for one dimensiaonal arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("-----------------------------");

        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
         */
        //index of elements:0,1,2      0  1  2  3    0  1  2   3    4
        int[][] array2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};//two dimension=two different index number
        //index Of Arrays       0           1               2

        System.out.println(Arrays.deepToString(array2D));

        //{4,5,6,7}
        System.out.println(Arrays.toString(array2D[1]));

        //{11}
        System.out.println(array2D[2][3]);

    }
}
