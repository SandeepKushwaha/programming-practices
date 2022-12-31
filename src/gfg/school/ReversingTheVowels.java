package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/reversing-the-vowels5304/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReversingTheVowels {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s;
            s = sc.next();

            ReversingTheVowelsSolution ob = new ReversingTheVowelsSolution();

            System.out.println(ob.modify(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class ReversingTheVowelsSolution {
    String modify(String s) {
        // your code here
        ArrayList<Character> charList = new ArrayList<>();
        StringBuilder reverse = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                charList.add(ch);
            }
        }

        if (charList.isEmpty()) return s;

        Collections.reverse(charList);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                reverse.append(charList.get(0));
                charList.remove(0);
            } else {
                reverse.append(ch);
            }
        }

        /* For loop in the form of IntStream
        java.util.stream.IntStream.range(0, s.length()).forEach(i -> {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                reverse.append(charList.get(0));
                charList.remove(0);
            } else {
                reverse.append(ch);
            }
        });*/

        return reverse.toString();
    }
}

