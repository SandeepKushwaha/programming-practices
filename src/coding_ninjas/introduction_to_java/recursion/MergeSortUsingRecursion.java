package coding_ninjas.introduction_to_java.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortUsingRecursion {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = s.nextInt();
        return arr;
    }

    public static void printArray(int[] input) {
        for (int i : input)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        mergeSort(input);
        printArray(input);
    }

    private static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            mergeSort(arr, startIndex, midIndex);
            mergeSort(arr, midIndex + 1, endIndex);
            merge(arr, startIndex, midIndex, endIndex);
        }
    }

    private static void merge(int[] arr, int startIndex, int midIndex, int endIndex) {
        int[] left = Arrays.copyOfRange(arr, startIndex, midIndex + 1);
        int[] right = Arrays.copyOfRange(arr, midIndex + 1, endIndex + 1);

        int i = 0, j = 0, k = startIndex;

        while (i < left.length && j < right.length)
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];

        while (i < left.length)
            arr[k++] = left[i++];

        while (j < right.length)
            arr[k++] = right[j++];
    }
}
