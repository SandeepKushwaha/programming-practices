package coding_ninjas.data_structures_in_java.recursion;

import java.util.Scanner;

public class CheckNumberInArray {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++)
            input[i] = s.nextInt();

        int x = s.nextInt();
        System.out.println(checkNumber(input, x));
    }

    public static boolean checkNumber(int[] input, int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return checkNumber(input, x, 0);
    }

    public static boolean checkNumber(int[] input, int x, int index) {
        if (index == input.length)
            return false;

        if (input[index] == x)
            return true;

        return checkNumber(input, x, index + 1);
    }
}
