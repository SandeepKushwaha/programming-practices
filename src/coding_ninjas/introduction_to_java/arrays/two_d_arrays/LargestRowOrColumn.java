package coding_ninjas.introduction_to_java.arrays.two_d_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestRowOrColumn {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DArrayInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0)
            return new int[0][0];

        int[][] mat = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNumbers;
            strNumbers = br.readLine().trim().split("\\s");

            for (int col = 0; col < m_cols; col++)
                mat[row][col] = Integer.parseInt(strNumbers[col]);
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int[][] arr = take2DArrayInput();

            findLargest(arr);
            System.out.println();
        }
    }

    public static void findLargest(int[][] array) {
        //Your code goes here
        int row = 0, column = 0;
        int largestRowSum = Integer.MIN_VALUE;
        int largestColumnSum = Integer.MIN_VALUE;

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                int sum = 0;

                for (int item : array[i])
                    sum += item;

                if (largestRowSum < sum) {
                    largestRowSum = sum;
                    row = i;
                }
            }

            for (int i = 0; i < array[0].length; i++) {
                int sum = 0;

                for (int[] item : array)
                    sum += item[i];

                if (largestColumnSum < sum) {
                    largestColumnSum = sum;
                    column = i;
                }
            }
        }

        if (largestRowSum >= largestColumnSum)
            System.out.println("row " + row + " " + largestRowSum);
        else
            System.out.println("column " + column + " " + largestColumnSum);
    }

}
