package coding_ninjas.introduction_to_java.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAllSubString {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) str = str.trim();
        else str = "";

        printSubstrings(str);
        System.out.println();
        printSubstrings(str, false);
        System.out.println();
        printSubstrings(str, true);
    }

    private static void printSubstrings(String str) {
        // Write your code here.
        for (int i = 0; i < str.length(); i++)
            for (int j = i; j < str.length(); j++) {
                for (int k = i; k <= j; k++)
                    System.out.print(str.charAt(k));

                System.out.println();
            }

        /* Optimize Code for Print sub string.
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str.substring(i, j));
            }
        }
        */
    }

    private static void printSubstrings(String str, boolean arrange) {
        if (arrange) {
            for (int i = 1; i <= str.length(); i++) {
                for (int start = 0; start <= str.length() - i; start++) {
                    int end = start + i;
                    System.out.println(str.substring(start, end));
                }
            }
        } else {
            int n = str.length();
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j <= n; j++)
                    System.out.println(str.substring(i, j));
        }
    }
}
