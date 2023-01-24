package coding_ninjas.introduction_to_java.arrays.two_d_arrays;

import java.util.Scanner;

public class InputAndPrint2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number for column: ");
        int column = scanner.nextInt();

        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the element for position " + i + " row and " + j + " column : ");
                arr[i][j] = scanner.nextInt();
            }
        }

        /* Standard for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        */

        for (int[] rows : arr) {
            for (int i : rows) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
