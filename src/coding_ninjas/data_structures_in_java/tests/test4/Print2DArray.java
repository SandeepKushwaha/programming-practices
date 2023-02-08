package coding_ninjas.data_structures_in_java.tests.test4;

import java.util.Scanner;

public class Print2DArray {
    static Scanner s = new Scanner(System.in);

    public static int[][] takeInput() {
        int numRows = s.nextInt();
        int numCols = s.nextInt();
        int[][] input = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[][] input = takeInput();
        print2DArray(input);
    }

    public static void print2DArray(int[][] input) {
        // Write your code here
        int n = input.length;
        int m = input[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                for (int k = 0; k < m; k++) {
                    System.out.print(input[i][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
