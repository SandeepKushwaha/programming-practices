package coding_ninjas.introduction_to_java.recursion;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
