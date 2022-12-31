package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/check-for-binary/1
 *
 * */

//{ Driver Code Starts


import java.util.Scanner;

public class CheckForBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String str = sc.nextLine();
            CheckForBinarySolution g = new CheckForBinarySolution();
            boolean b = g.isBinary(str);
            if (b)
                System.out.println(1);
            else
                System.out.println(0);
            T--;
        }
    }
}


// } Driver Code Ends


class CheckForBinarySolution {
    boolean isBinary(String str) {
        //Your code here
        // Collections API
        // List<String> s = new ArrayList<>(Arrays.asList(str.split("")));
        // return (s.stream().filter(n -> !("01".contains(n))).count() > 0) ? false : true;

        // simple code by using char array.
        char[] ch = str.toCharArray();
        /*//for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '1' && ch[i] != '0') {
                return false;
            }
        }*/
        for (char c : ch) {
            if (c != '1' && c != '0') {
                return false;
            }
        }

        return true;
    }
}
