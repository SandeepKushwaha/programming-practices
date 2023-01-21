package coding_ninjas.introduction_to_java.arrays.sorting_searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        if (testCase > 0 && testCase <= 1000) {
            while (testCase-- > 0) {
                int length = scanner.nextInt();
                int[] arr = new int[length];

                for (int i = 0; i < length; i++) {
                    arr[i] = scanner.nextInt();
                }

                int searchElement = scanner.nextInt();

                // Note: for binary search Array must be sorted.
                System.out.println(binarySearch(arr, searchElement));
            }
        }
    }

    private static int binarySearch(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] > element) {
                end = mid - 1;
            } else if (arr[mid] < element) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
