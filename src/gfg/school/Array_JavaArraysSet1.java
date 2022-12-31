package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/java-arrays-set-11354/1
 *
 * */

//{ Driver Code Starts

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_JavaArraysSet1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String str;
        String[] st;

        while (t > 0) {
            int N = Integer.parseInt(br.readLine());
            int sum = 0;

            int[] A = new int[N];
            str = br.readLine();
            st = str.split(" ");
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st[i]);
                sum += A[i];
            }
            ComputeAverage ob = new ComputeAverage();
            String s = ob.average(A, N);
            System.out.println(sum + " " + s);
            t--;
        }
    }
}

// } Driver Code Ends


class ComputeAverage {
    String average(int[] A, int N) {
        int sum = 0;

        for (int item : A) {
            sum += item;
        }

        return String.format("%.2f", (float) sum / N);
    }


    /*
     swap number code
     static List<Integer> get(int a, int b) {
         return List.of(b, a);
     }
    */
}

