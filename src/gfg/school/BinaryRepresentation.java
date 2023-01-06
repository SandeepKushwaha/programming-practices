package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/binary-representation5003/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.IOException;
import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            BinarySolution ob = new BinarySolution();
            String ans = ob.getBinaryRep(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class BinarySolution {
    /*static*/ String getBinaryRep(int N) {
        String binary = Integer.toBinaryString(N);
        if (N < 0)
            return binary.substring(2);
        else {
            if (binary.length() == 30)
                return binary;
            else
                return "0".repeat(Math.max(0, binary.length() - 30)) + binary;
        }

        /* Using Iteration method to find the binary representation
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            strBuilder.append(String.valueOf(N%2));
            N /= 2;
        }

        return strBuilder.reverse().toString();
        */
    }
}


