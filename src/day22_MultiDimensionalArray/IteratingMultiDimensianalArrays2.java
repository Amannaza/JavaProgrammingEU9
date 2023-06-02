package day22_MultiDimensionalArray;

public class IteratingMultiDimensianalArrays2 {
    public static void main(String[] args) {

        int[][] array2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = array2D.length - 1; i >= 0; i--) {

            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");

        for (int i = 0; i < array2D.length; i++) {      //indexes of each array started from 0

            for (int j = array2D[i].length - 1; j >= 0; j--) {    //indexes of each element starting from last element
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------");

        for (int i = array2D.length - 1; i >= 0; i--) {
            for (int j = array2D[i].length-1; j >=0; j--) {
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }

    }
}

              /*
       task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
       task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
       task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1

 */