package coding_ninjas.introduction_to_java.tests.test2;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(max_number(n));
    }

    public static int max_number(int n) {

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int maxPow = 1;
        while (maxPow < n) {
            maxPow *= 10;
        }
        for (int i = maxPow / 10; i >= 10; i /= 10) {
            int digit = n / i % 10;
            int right = n / (i / 10) % 10;
            if (digit < right) {
                return n % i + n / (i * 10) * i;
            }
        }
        return n / 10;
    }
}
