package coding_ninjas.introduction_to_java.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int length = scanner.nextInt();
            int[] arr = new int[length];

            for (int i = 0; i < length; i++)
                arr[i] = scanner.nextInt();

            // sort an array
            Arrays.sort(arr);

            // input for search element
            int element = scanner.nextInt();

            // returns the index in the case of found else returns -1
            System.out.println(binarySearchUsingRecursion(arr, element));

        }
    }

    private static int binarySearchUsingRecursion(int[] arr, int element) {
        return binarySearchUsingRecursion(arr, element, 0, arr.length - 1);
    }

    private static int binarySearchUsingRecursion(int[] arr, int element, int startIndex, int endIndex) {
        if (startIndex > endIndex) return -1;

        int midIndex = (startIndex + endIndex) / 2;
        if (arr[midIndex] == element) return midIndex;
        else if (arr[midIndex] < element) return binarySearchUsingRecursion(arr, element, midIndex + 1, endIndex);
        else return binarySearchUsingRecursion(arr, element, startIndex, midIndex - 1);
    }
}
