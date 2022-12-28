package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/find-the-median0527/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_FIndMedian {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[n];
            for (int i = 0; i < n; i++)
                v[i] = Integer.parseInt(S[i]);
            Array_FIndMedianSolution ob = new Array_FIndMedianSolution();
            int ans = ob.find_median(v);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Array_FIndMedianSolution {
    public int find_median(int[] v) {
        // sorting the array
        // Arrays.sort(v);
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }

        // calculating the median
        if (v.length % 2 != 0) {
            return v[v.length / 2];
        } else {
            int m_index = v.length / 2;
            return (v[m_index] + v[m_index - 1]) / 2;
        }
    }
}

