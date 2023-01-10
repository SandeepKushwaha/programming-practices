package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/java-switch-case-statement3529/1
 *
 * */

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class JavaSwitchCaseStatement {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int choice = Integer.parseInt(in.readLine());
            String[] a = in.readLine().trim().split("\\s+");
            List<Double> arr = new ArrayList<>();
            for (int i = 0; i < choice; i++)
                arr.add(Double.parseDouble(a[i]));

            JavaSwitchCaseStatementSolution ob = new JavaSwitchCaseStatementSolution();
            if (choice == 1) System.out.println(ob.switchCase(choice, arr));
            else System.out.println((int) ob.switchCase(choice, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class JavaSwitchCaseStatementSolution {
    /*static*/ double switchCase(int choice, List<Double> arr) {
        // code here
        double result = 0;
        switch (choice) {
            case 1 -> {
                double radius = arr.get(0);
                if (radius >= 1 && radius <= 100) result = Math.PI * radius * radius;
            }
            // throw new RuntimeException("Radius out of bound");

            case 2 -> {
                double length = arr.get(0);
                double breath = arr.get(1);
                if (length >= 1 && length <= 100 && breath >= 1 && breath <= 100) result = length * breath;
            }
            // throw new RuntimeException("Length or breath out of bound");

        }
        /* For Java version less than 11
        switch(choice) {
            case 1:
                double radius = arr.get(0);
                if (radius >= 1 && radius <= 100)
                    result =  Math.PI * radius * radius;
                break;
                // throw new RuntimeException("Radius out of bound");

            case 2:
                double length = arr.get(0);
                double breath = arr.get(1);

                if (length >= 1 && length <= 100 && breath >= 1 && breath <= 100)
                    result = length * breath;
                break;
                // throw new RuntimeException("Length or breath out of bound");

        }
        */

        return result;
    }
}


