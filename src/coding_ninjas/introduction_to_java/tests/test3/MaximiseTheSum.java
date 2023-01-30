package coding_ninjas.introduction_to_java.tests.test3;

import java.util.Scanner;

public class MaximiseTheSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int[] input1 = new int[m];
        for (int i = 0; i < m; i++) {
            input1[i] = s.nextInt();
        }
        int n = s.nextInt();
        int[] input2 = new int[n];
        for (int i = 0; i < n; i++) {
            input2[i] = s.nextInt();
        }
        System.out.println(maximumSumPath(input1, input2));
    }

    public static long maximumSumPath(int[] ar1, int[] ar2) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, they are passed as function arguments.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        // sort array if not sorted
        java.util.Arrays.sort(ar1);
        java.util.Arrays.sort(ar2);

        // initialize the m,n size of ar1 and ar2
        int m = ar1.length;
        int n = ar2.length;

        // initialize indexes for ar1[] and ar2[]
        int i = 0, j = 0;

        // Initialize result and current sum through ar1[]
        // and ar2[].
        long result = 0;
        int sum1 = 0, sum2 = 0;

        // Below 3 loops are similar to merge in merge sort
        while (i < m && j < n) {
            // Add elements of ar1[] to sum1
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];

                // Add elements of ar2[] to sum2
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];

                // we reached a common point
            else {
                // Take the maximum of two sums and add to
                // result
                // Also add the common element of array,
                // once
                result += Math.max(sum1, sum2) + ar1[i];

                // Update sum1 and sum2 for elements after
                // this intersection point
                sum1 = 0;
                sum2 = 0;

                // update i and j to move to next element of
                // each array
                i++;
                j++;
            }
        }

        // Add remaining elements of ar1[]
        while (i < m)
            sum1 += ar1[i++];

        // Add remaining elements of ar2[]
        while (j < n)
            sum2 += ar2[j++];

        // Add maximum of two sums of remaining elements
        result += Math.max(sum1, sum2);

        return result;
    }
}
