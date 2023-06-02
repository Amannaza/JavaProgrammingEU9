package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensiaonalArray {
    public static void main(String[] args) {

        //index of elements:0,1,2      0  1  2  3    0  1  2   3    4
        int[][] array2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //index Of Arrays       0           1               2

        for (int i = 0; i < array2D.length; i++) {

//    System.out.println(Arrays.toString(array2D[i]));

            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");


    }
}
