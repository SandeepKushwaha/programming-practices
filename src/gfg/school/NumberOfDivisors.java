package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/number-of-divisors1631/1
 *
 * */

//{ Driver Code Starts

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfDivisors {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            NumberOfDivisorsSolution ob = new NumberOfDivisorsSolution();
            System.out.println(ob.count_divisors(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class NumberOfDivisorsSolution {
    /*static*/ long count_divisors(int N) {

        if (N % 3 != 0) return 0;

        long count = 1;
        for (int i = 3; i <= N / 2; i += 3) {
            if (N % i == 0) count++;
        }

        return count;
    }
}


