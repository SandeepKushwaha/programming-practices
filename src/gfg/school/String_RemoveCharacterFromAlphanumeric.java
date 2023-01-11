package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/remove-characters-from-alphanumeric-string0648/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_RemoveCharacterFromAlphanumeric {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            RemoveCharacterFromAlphanumericSolution ob = new RemoveCharacterFromAlphanumericSolution();
            String result = ob.removeCharacters(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class RemoveCharacterFromAlphanumericSolution {
    String removeCharacters(String S) {
        // code here
        StringBuilder sb = new StringBuilder();

        for (char ch : S.toCharArray()) {
            if ((ch >= 48) && (ch <= 57)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}


