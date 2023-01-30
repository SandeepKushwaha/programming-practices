package coding_ninjas.introduction_to_java.tests.test2;

import java.util.Scanner;

public class Probability {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        System.out.println(probability(n, x));
    }

    static double factorial(double number) {
        if (number <= 0)
            return 1;

        return number * factorial(number - 1);
    }

    public static int probability(int n, int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        double Ns, Ne1, Ne2;
        int Pe;
        Ns = factorial(8.0) / (factorial(n * 1.0) * factorial(8.0 - n));
        Ne1 = factorial(4.0) / (factorial(x * 1.0) * factorial(4.0 - x));
        Ne2 = factorial(4.0) / (factorial(((n - x) * 1.0)) * factorial((4.0 - (n - x))));
        Pe = (int) (((Ne1 * Ne2) / Ns) * 100);
        return Pe;
    }
}
