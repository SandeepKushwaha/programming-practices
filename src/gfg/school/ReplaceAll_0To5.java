package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/replace-all-0-with-5-in-an-input-integer/1
 *
 * */
//{ Driver Code Starts

import java.util.Scanner;

public class ReplaceAll_0To5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ReplaceAll_0To5Solution g = new ReplaceAll_0To5Solution();
            System.out.println(g.convertFive(n));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class ReplaceAll_0To5Solution {
    public /*static*/ int convertFive(int n) {
        if (n > 0 && n <= 10000) {
            return  Integer.parseInt(Integer.toString(n).replace('0', '5'));

            /* Solution by regular method i.e. calculation based on remainder of number
            int temp = n;
            int num = 0;
            int power = 0;
            while (temp > 0) {
                int rem = temp % 10;
                if (rem == 0) rem = 5;
                num = rem * (int) Math.pow(10, power) + num;
                temp /= 10;
                power++;
            }
            return num;*/
        }
        return n;
    }
}

