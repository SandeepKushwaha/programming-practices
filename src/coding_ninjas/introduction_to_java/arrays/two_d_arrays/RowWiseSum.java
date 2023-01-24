package coding_ninjas.introduction_to_java.arrays.two_d_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RowWiseSum {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
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
            int[][] mat = take2DInput();
            RowWiseSumSolution.rowWiseSum(mat);
            System.out.println();
        }
    }

    static class RowWiseSumSolution {
        public static void rowWiseSum(int[][] arr) {
            for (int[] ints : arr) {
                int sum = 0;
                for (int i : ints) {
                    sum += i;
                }

                System.out.print(sum + " ");
            }
        }
    }
}
