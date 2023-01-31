package coding_ninjas.introduction_to_java.arrays.two_d_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoundariesAndDiagonalsTotalSum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        int n = Integer.parseInt(br.readLine().trim());

        if (n == 0)
            return new int[0][0];

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] strNumbers;
            strNumbers = br.readLine().trim().split("\\s");

            for (int col = 0; col < n; col++)
                matrix[row][col] = Integer.parseInt(strNumbers[col]);
        }

        return matrix;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int[][] mat = take2DInput();

            totalSum(mat);
            System.out.println();
        }
    }

    // For a given two-dimensional square matrix of size (N x N).
    // Find the total sum of elements on both the diagonals and at all the four boundaries.
    public static void totalSum(int[][] array) {
        //Your code goes here
        int sum = 0;

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                if (i == 0 | j == 0 | i == array.length - 1 | i == j | j == array[i].length - 1 | j == array.length - 1 - i)
                    sum += array[i][j];

        System.out.println(sum);
    }
}
