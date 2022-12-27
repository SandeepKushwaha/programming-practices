package gfg.school;

/*
 *  problem: https://practice.geeksforgeeks.org/problems/print-the-pattern-set-1/1
 *
 * */

//{ Driver Code Starts

import java.util.Scanner;

public class PrintThePattern_Set1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            PrintThePattern_Set1Solution g = new PrintThePattern_Set1Solution();
            g.printPat(n);
            System.out.println();

            t--;
        }
    }
}
// } Driver Code Ends


class PrintThePattern_Set1Solution {
    void printPat(int n) {
        // loop n to 0 is i
        for (int i = n; i > 0; i--) {
            // loop n to 0 is j
            for (int j = n; j > 0; j--) {
                // for evaluation and printing the number
                int data = i;
                while (data > 0) {
                    System.out.print(j + " ");
                    data--;
                }
            }
            System.out.print("$");
        }
    }
}