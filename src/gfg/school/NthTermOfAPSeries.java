package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/series-ap5310/1
 *
 * */

//{ Driver Code Starts
// Initial Template for Java


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NthTermOfAPSeries {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A1 = Integer.parseInt(S[0]);
            int A2 = Integer.parseInt(S[1]);
            int N = Integer.parseInt(S[2]);
            NthTermOfAPSeriesSolution ob = new NthTermOfAPSeriesSolution();
            System.out.println(ob.nthTermOfAP(A1, A2, N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class NthTermOfAPSeriesSolution {
    int nthTermOfAP(int A1, int A2, int N) {
        // code here
        if (A1 >= -10_000 && A2 >= -10_000 && A1 <= 10_000 && A2 <= 10_000) {
            if (N >= 1 && N <= 1000) {
                return A1 + (N - 1) * (A2 - A1);
            }
        }
        return 0;
    }
}

