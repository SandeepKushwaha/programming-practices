package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/full-prime2659/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_FullPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            FullPrimeSolution ob = new FullPrimeSolution();
            System.out.println(ob.fullPrime(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class FullPrimeSolution {
    // check for prime number or not
    static boolean isPrime(int number) {
        if (number == 0 || number == 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    /*static*/ int fullPrime(int N) {
        //code here
        boolean result = false;

        if (isPrime(N))
            while (N > 0) {
                int digit = N % 10;
                if (isPrime(digit))
                    result = true;
                else {
                    result = false;
                    break;
                }
                N /= 10;
            }

        if (result) return 1;
        else return 0;
    }
}


