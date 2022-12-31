package gfg.school;

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            ReverseDigitsSolution ob = new ReverseDigitsSolution();
            long ans = ob.reverse_digit(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class ReverseDigitsSolution {
    public long reverse_digit(long n) {
        if (n >= 1 && n <= 1_000_000_000_000_000L) {
            long reverse = 0;
            long temp = n;
            while (temp > 0) {
                reverse = (reverse * 10) + temp % 10;
                temp /= 10;
            }
            return reverse;
        }

        return -1;
    }
}
