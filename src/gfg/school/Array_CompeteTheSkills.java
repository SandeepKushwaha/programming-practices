package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/compete-the-skills5807/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_CompeteTheSkills {

    static long ca = 0, cb = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = 3;
            long[] a = new long[(int) (n)];
            long[] b = new long[(int) (n)];


            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String[] inputLine1 = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }


            CompeteTheSkillsSolution obj = new CompeteTheSkillsSolution();
            obj.scores(a, b);
            System.out.println(ca + " " + cb);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class CompeteTheSkillsSolution {

    public void scores(long[] a, long[] b) {
        // store the answer as
        Array_CompeteTheSkills.ca = 0;
        Array_CompeteTheSkills.cb = 0;
        // Your code goes here
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && a[i] <= 100_000_000_000_000_000L && b[i] > 0 && b[i] <= 100_000_000_000_000_000L) {
                if (a[i] > b[i]) Array_CompeteTheSkills.ca++;
                else if (a[i] < b[i]) Array_CompeteTheSkills.cb++;
            }
        }
    }
}

