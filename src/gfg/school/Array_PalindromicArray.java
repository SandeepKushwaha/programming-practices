package gfg.school;

/*
 *
 * Problem::https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1
 *
 * */

//{ Driver Code Starts

import java.util.Scanner;

public class Array_PalindromicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            // Array_PalindromicArraySolution g = new Array_PalindromicArraySolution();
            System.out.println(Array_PalindromicArraySolution.palindromicArray(a, n));
        }
    }
}
// } Driver Code Ends


/*Complete the Function below*/
class Array_PalindromicArraySolution {
    public static int palindromicArray(int[] a, int ignoredN) {
        //add code here.
        boolean flag = true;

        for (int number : a) {
            int reverse = 0;
            int temp = number;
            while (number > 0) {
                reverse = (reverse * 10) + number % 10;
                number /= 10;
            }

            if (reverse != temp) {
                flag = false;
                break;
            }
        }

        return flag ? 1 : 0;

    }
}

