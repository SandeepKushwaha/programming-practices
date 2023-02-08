package coding_ninjas.data_structures_in_java.tests.test4;

import java.util.Scanner;

public class SplitArray {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(splitArray(input));
    }

    public static boolean splitArray(int[] input) {
        /* Your class should be named solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return splitArray(input, 0, 0, 0);
    }

    public static boolean splitArray(int[] arr, int startIndex, int leftSum, int rightSum) {
        if (startIndex == arr.length) return leftSum == rightSum;

        if (arr[startIndex] % 5 == 0) leftSum += arr[startIndex];
        else if (arr[startIndex] % 3 == 0) rightSum += arr[startIndex];
        else
            return splitArray(arr, startIndex + 1, leftSum + arr[startIndex], rightSum) ||
                    splitArray(arr, startIndex + 1, leftSum, rightSum + arr[startIndex]);

        return splitArray(arr, startIndex + 1, leftSum, rightSum);
    }
}
