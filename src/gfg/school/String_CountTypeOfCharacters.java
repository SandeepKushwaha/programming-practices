package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/count-type-of-characters3635/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

public class String_CountTypeOfCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int[] res = new CountTypeOfCharactersSolution().count(s);

            for (int i = 0; i < 4; i++)
                System.out.println(res[i]);
        }

    }
}

// } Driver Code Ends


//User function Template for Java

class CountTypeOfCharactersSolution {
    int[] count(String s) {
        char[] chars = s.toCharArray();
        int[] types = {0, 0, 0, 0}; // Upper Case, Lower Case, Numeric, Special

        for (char ch : chars) {
            if (ch >= 65 && ch <= 90) {
                types[0]++; // increment for upper
            } else if (ch >= 97 && ch <= 122) {
                types[1]++; // increment for lower
            } else if (ch >= 48 && ch <= 57) {
                types[2]++; // increment for numeric
            } else {
                types[3]++; // increment for special
            }
        }

        return types;
    }
}
