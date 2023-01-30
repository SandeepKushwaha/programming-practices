package coding_ninjas.introduction_to_java.tests.test3;

import java.util.Scanner;

public class FindLeaderInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        leaders(input);
    }

    public static void leaders(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        int n = input.length;
        int max = input[n - 1];
        System.out.print(max + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (input[i] >= max) {
                max = input[i];
                System.out.print(max + " ");
            }
        }
    }
}
