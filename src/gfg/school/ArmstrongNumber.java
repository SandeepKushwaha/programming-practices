package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArmstrongNumberSolution ob = new ArmstrongNumberSolution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class ArmstrongNumberSolution {
    /*static*/ String armstrongNumber(int n) {
        // code here
        int temp = n;
        int armstrong = 0;
        while (temp > 0) {
            armstrong += Math.pow(temp % 10, 3);
            temp /= 10;
        }

        if (armstrong == n) {
            return "Yes";
        } else {
            return "No";
        }

    }
}

