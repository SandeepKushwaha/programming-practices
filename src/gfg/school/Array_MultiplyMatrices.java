package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/multiply-matrices/1
 *
 * */

//{ Driver Code Starts

import java.util.Scanner;

public class Array_MultiplyMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            int[][] b = new int[n][n];
            int[][] c = new int[n][n];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    b[i][j] = sc.nextInt();

            Matrix g = new Matrix();
            g.multiply(a, b, c, n);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


/* Complete the function below */
class Matrix {
    public /*static*/ void multiply(int[][] A, int[][] B, int[][] C, int N) {
        //add code here.
        // For Matrix A x B = the number of columns in A Matrix has to equal the number of rows in B
        if (N > 0 && N <= 20) {
            int rowsOfA = A[0].length;
            int colsOfB = 0;
            for (int[] ignored : B) {
                colsOfB++;
            }

            if (rowsOfA == colsOfB) {
                for (int i = 0; i < A.length; i++) {
                    for (int j = 0; j < B[i].length; j++) {
                        for (int k = 0; k < A.length; k++) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
            }
        }
    }
}


