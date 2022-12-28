package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/count-digits5716/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigit_EvenlyDivides {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            CountDigit_EvenlyDividesSolution ob = new CountDigit_EvenlyDividesSolution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class CountDigit_EvenlyDividesSolution {
    /*static*/ int evenlyDivides(int N) {
        int count = 0;
        int temp = N;
        int digit;

        while (temp > 0) {
            digit = temp % 10;
            if (digit != 0 && N % digit == 0) count++;
            temp /= 10;
        }
        return count;
    }
}
