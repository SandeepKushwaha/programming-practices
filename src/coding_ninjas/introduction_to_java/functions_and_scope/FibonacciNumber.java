package coding_ninjas.introduction_to_java.functions_and_scope;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(FibonacciNumber.checkMember(n));
    }

    static boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    private static boolean checkMember(int n) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (n >= 0 && n <= 10_000) {
            return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
        }

        return false;
    }
}
