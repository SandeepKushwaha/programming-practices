package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/display-longest-name0853/1
 *
 * */

//{ Driver Code Starts

import java.util.Scanner;

public class Array_DisplayLongestName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;

        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n;
            n = sc.nextInt();
            String[] names = new String[n];

            for (int j = 0; j < n; j++) names[j] = sc.next();

            DisplayLongestNameSolution obj = new DisplayLongestNameSolution();
            System.out.println(obj.longest(names, n));
        }
    }

}

// } Driver Code Ends

class DisplayLongestNameSolution {
    String longest(String[] names, int n) {
        String longest = names[0];
        for (int i = 0; i < n; i++) {
            if (names[i].length() > longest.length()) {
                longest = names[i];
            }
        }
        return longest;
    }
}

