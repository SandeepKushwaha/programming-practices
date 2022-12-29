package gfg.school;

/*
*
* problem : https://practice.geeksforgeeks.org/problems/perfect-arrays4645/1
*
* */

//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_isPerfect {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        while(testcases-- > 0){

            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];


            String line = br.readLine();
            String[] elements = line.trim().split(" ");

            for(int index = 0;index < n; index++){
                arr[index] = Integer.parseInt(elements[index]);
            }

            Array_isPerfectSolution obj = new Array_isPerfectSolution();
            if(obj.IsPerfect(arr, n))
                System.out.println("PERFECT");
            else
                System.out.println("NOT PERFECT");
        }

    }
}


// } Driver Code Ends



class Array_isPerfectSolution{
    public boolean IsPerfect(int[] a, int n) {
        if (n > 0 && n <= 1_000_000) { // 100_000
            for (int i = 0; i < n; i++) {
                if (a[i] < 0 && a[i] >= 10_000) { // 1_000
                    return false;
                }
            }

            for (int i = 0, j = n - 1; i < j; i++, j--) {
                if (a[i] != a[j])
                    return false;
            }
        }

        return true;
    }

}

