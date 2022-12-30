package gfg.school;

/*
*
* problem : https://practice.geeksforgeeks.org/problems/java-reverse-a-string0416/1
*
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        scanner.nextLine(); // clear the buffer.

        if (cases > 0 && cases < 101) {

            String[] inputs = new String[cases];

            // each case inputs
            for (int i = 0; i < cases; i++) {
                inputs[i] = scanner.nextLine();
            }

            // each case outputs
            for (String word : inputs) {
                // each input in case
                StringBuilder reverse = new StringBuilder();

                for (int l = word.length() - 1; l >= 0; l--) {
                    reverse.append(word.charAt(l));
                }

                System.out.println(reverse);
            }
        }
    }
}

//{ Driver Code Starts
// Initial template for Java

class ReverseStringForSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            ReverseStringSolution ob = new ReverseStringSolution();

            System.out.println(ob.revStr(S));
        }
    }
}
// } Driver Code Ends


class ReverseStringSolution {
    /*static*/ String revStr(String S) {
        StringBuilder reverse = new StringBuilder();

        if (S.length() > 0 && S.length() <= 1000) {
            for (int i = S.length(); i > 0; i--) {
                reverse.append(S.charAt(i - 1));
            }
        }

        return reverse.toString();
    }
}

