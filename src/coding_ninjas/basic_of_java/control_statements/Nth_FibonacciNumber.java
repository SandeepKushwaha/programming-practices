package coding_ninjas.basic_of_java.control_statements;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1459173
 *
 * */

import java.io.IOException;
import java.util.Scanner;

public class Nth_FibonacciNumber {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int number = scanner.nextInt();
            System.out.println(fibonacciNumber(number));
        }
    }

    // public static int fibonacciNumber(int n) {
    // check constraints with return answer modulo 10^9 + 7
    // i.e. int mod = 1e9+7

        /* Having Time Complexity
        // int mod = 1000000007;
        int a = 0, b = 1, temp;
        if (n == 0)
            return a;

        int i = 2;
        while (i <= n) {
            temp = (a + b) % 1000000007;
            a = b;
            b = temp;
            i++;
        }

        return b;
        */

    // Following code is same as above but solution with recursion
        /* Having Time Complexity
        f (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return (int) (fibonacciNumber(n - 1) + fibonacciNumber(n - 2));
        */
    // }

    public static long[][] multiply(long[][] a, long[][] b) {
        long[][] c = new long[2][2];
        long mod = (long) (1e9 + 7); // 1000000007
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    c[i][j] = (c[i][j] + (a[i][k] % mod * b[k][j] % mod)) % mod;
                }
            }
        }
        return c;
    }

    public static long[][] matrixExpression(long[][] d, long n) {
        if (n == 0)
            return new long[][]{{1, 0}, {0, 1}};
        long[][] res = matrixExpression(d, n / 2);
        if (n % 2 == 0) {
            res = multiply(res, res);
        } else {
            res = multiply(res, res);
            res = multiply(res, d);
        }

        return res;
    }

    // Solve by using Divide and Conquer method for more read article : https://www.geeksforgeeks.org/java-program-for-program-for-fibonacci-numbers/
    public static int fibonacciNumber(int n) {
        long[][] dp = {{1, 1}, {1, 0}};
        long[][] ans = matrixExpression(dp, (long) n - 1);
        return (int) (ans[0][0]);
    }

}
