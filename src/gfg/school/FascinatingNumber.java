package gfg.school;

//{ Driver Code Starts

import java.util.Arrays;
import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FascinatingNumberSolution ob = new FascinatingNumberSolution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class FascinatingNumberSolution {
    boolean fascinating(long n) {
        boolean isFascinating = false;

        if (n >= 100 && n <= 2_000_000_000) {

            String temp = Long.toString(n) + (n * 2) + (n * 3);

            /* the regular approach or meaningful solution
            char[] digits = temp.toCharArray();
            Arrays.sort(digits);

            String fascinating = "123456789";
            String number = new String(digits);

            return number.equals(fascinating);*/

            char[] digits = temp.toCharArray();
            Arrays.sort(digits);
            return new String(digits).equals("123456789");
        }

        return isFascinating;
    }
}

