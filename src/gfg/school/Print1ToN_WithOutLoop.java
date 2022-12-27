package gfg.school;

/*
 *
 * Problem: https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.Scanner;

public class Print1ToN_WithOutLoop {
    public static void main(String[] args) {

        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking total testcases
        int T = sc.nextInt();
        while (T-- > 0) {
            //creating an object of class Print
            Print1ToN_WithOutLoop_Solution obj = new Print1ToN_WithOutLoop_Solution();
            int N;

            //input N
            N = sc.nextInt();

            //calling printNos() methdo
            //of class Print
            obj.printNos(N);
            System.out.println();

        }

    }
}


// } Driver Code Ends


//User function Template for Java


class Print1ToN_WithOutLoop_Solution {
    public void printNos(int N) {
        //int i = N;
        if (N <= 0)
            return;
        printNos(N - 1);
        System.out.print(N + " ");
    }
}
