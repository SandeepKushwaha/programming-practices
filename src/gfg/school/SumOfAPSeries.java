package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/sum-of-ap-series4512/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.stream.IntStream.iterate;

public class SumOfAPSeries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine();
            String[] S = s.split(" ");
            long n = Long.parseLong(S[0]);
            long a = Long.parseLong(S[1]);
            long d = Long.parseLong(S[2]);
            SumOfAPSeriesSolution ob = new SumOfAPSeriesSolution();
            Long ans = ob.sum_of_ap(n, a, d);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class SumOfAPSeriesSolution {
    public long sum_of_ap(long n, long a, long d) {
        // using Formula for Sum Of AP Series : n/2[2a + (n – 1)d]
        // return (n * (2 * a + (n - 1) * d)) / 2;

        /* using traditional loop
        long ap = 0;
        for (int i = 0; i < n; i++) {
            ap += a + (i * d);
        }
        return ap;
        */

        // Using IntStream iterate(seed, hasNext, next) method. via static import
        return iterate(0, i -> i < n, i -> i + 1).mapToLong(i -> a + (i * d)).sum();


    }
}


