package coding_ninjas.introduction_to_java.arrays.two_d_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintSineWave {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int n_rows = Integer.parseInt(strRowsCols[0]);
        int m_cols = Integer.parseInt(strRowsCols[1]);

        if (n_rows == 0)
            return new int[0][0];

        int[][] matrix = new int[n_rows][m_cols];

        for (int row = 0; row < n_rows; row++) {
            String[] strNumbers;
            strNumbers = br.readLine().trim().split("\\s");

            for (int col = 0; col < m_cols; col++)
                matrix[row][col] = Integer.parseInt(strNumbers[col]);
        }

        return matrix;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int[][] mat = take2DInput();

            printSineWave(mat);
            System.out.println();
        }
    }

    public static void printSineWave(int[][] arr) {
        int n = arr.length;
        if (n == 0)
            return;
        int m = arr[0].length;
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0)
                /* Standard for loop
                for (int i = 0; i < n; i++)
                 	System.out.print(arr[i][j] + " ");
                */
                for (int[] ints : arr)
                    System.out.print(ints[j] + " ");
            else
                for (int i = n - 1; i >= 0; i--)
                    System.out.print(arr[i][j] + " ");
        }
    }
}
