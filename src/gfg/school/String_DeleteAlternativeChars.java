package gfg.school;

/*
*
* problem : https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters4036/1
*
* */

//{ Driver Code Starts
// Initial template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class String_DeleteAlternativeChars {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            DeleteAlternativeCharsSolution ob = new DeleteAlternativeCharsSolution();

            System.out.println(ob.delAlternate(S));
        }
    }
}
// } Driver Code Ends


// User function template for Java

class DeleteAlternativeCharsSolution {
    /*static*/ String delAlternate(String S) {
        StringBuilder result = new StringBuilder();
        // each input alternate words
        for (int j = 0; j < S.length(); j++) {
            if (j%2==0) {
                result.append(S.charAt(j));
            }
        }
        return result.toString();
    }
}

// -------------------------------------------------------------------
class DeleteAlternativeCharters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        scanner.nextLine(); // used for clear the buffer.

        if (cases>0 && cases<101) {
            String[] inputs = new String[cases];

            // each case inputs
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = scanner.nextLine();
            }

            // each case outputs
            for (String input : inputs) {

                // each input alternate words
                for (int j = 0; j < input.length(); j++) {
                    if (j % 2 == 0) {
                        System.out.print(input.charAt(j));
                    }
                }
                System.out.println();
            }
        }
    }
}
