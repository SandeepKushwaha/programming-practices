package coding_ninjas.introduction_to_java.arrays.two_d_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintSpiral {
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

        while(t-- > 0) {
            int[][] matrix = take2DInput();

            spiralPrint(matrix);
            System.out.println();
        }
    }

    private static void spiralPrint(int[][] matrix) {
        if (matrix.length > 0) {
            int rowStart = 0;
            int columnStart = 0;
            int rowEnd = matrix.length - 1;
            int columnEnd = matrix[0].length - 1;
            while (rowStart <= rowEnd && columnStart <= columnEnd) {
                //print first row
                for (int i = columnStart; i <= columnEnd; i++) {
                    System.out.print(matrix[rowStart][i] + " ");
                }
                rowStart++;

                //print last column
                for (int i = rowStart; i <= rowEnd; i++) {
                    System.out.print(matrix[i][columnEnd] + " ");
                }
                columnEnd--;

                //print last row
                if (rowStart <= rowEnd) {
                    for (int i = columnEnd; i >= columnStart; i--) {
                        System.out.print(matrix[rowEnd][i] + " ");
                    }
                    rowEnd--;
                }

                //print first column
                if (columnStart <= columnEnd) {
                    for (int i = rowEnd; i >= rowStart; i--) {
                        System.out.print(matrix[i][columnStart] + " ");
                    }
                    columnStart++;
                }
            }
        }
    }
}
