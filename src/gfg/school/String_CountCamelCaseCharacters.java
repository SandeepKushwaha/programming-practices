package gfg.school;

//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

public class String_CountCamelCaseCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            System.out.println(new Sol().countCamelCase(s));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Sol {
    int countCamelCase(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
                count++;
        }

        return count;
    }
}
