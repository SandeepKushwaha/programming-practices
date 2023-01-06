package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/vowel-or-not0831/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class String_isVowel {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        /* manual readLine code for String reading from console
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        */
    }

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            char c = sc.next().charAt(0);

            IsVowelSolution ob = new IsVowelSolution();
            System.out.println(ob.isVowel(c));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class IsVowelSolution {
    String isVowel(char c) {
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> "YES";
            default -> "NO";
        };
        /*
        Java 8 representation
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return "YES";
            default:
                return "NO";
        }
        */
    }
}


