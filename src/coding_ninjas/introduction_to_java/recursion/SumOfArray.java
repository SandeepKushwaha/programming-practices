package coding_ninjas.introduction_to_java.recursion;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(sum(arr));
    }

    public static int sum(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return sum(input, 0);
    }

    private static int sum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sum(arr, index + 1);
    }
}
