package gfg.school;

/*
*
* problem : https://practice.geeksforgeeks.org/problems/java-convert-string-to-lowercase2313/1
*
* */

//{ Driver Code Starts
// Initial template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StingLowerCase {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            StingLowerCaseSolution ob = new StingLowerCaseSolution();

            System.out.println(ob.toLower(S));
        }
    }
}
// } Driver Code Ends


// User function template for Java

class StingLowerCaseSolution {
    /*static*/ String toLower(String S) {
        // return S.toLowerCase();

        // conventional way to doing this
        StringBuilder text = new StringBuilder();
        // String text = "";
         for(int i = 0; i < S.length(); i++) {
             if (S.charAt(i) >= 97) {
                 text.append(S.charAt(i));
                 // text += S.charAt(i);
             } else {
                 int ascii = (int) S.charAt(i) + 32;
                 text.append((char) ascii);
                 // text += (char) ascii;
             }
         }
         return text.toString();
         // return text;
    }
}

