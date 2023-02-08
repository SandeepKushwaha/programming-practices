package coding_ninjas.data_structures_in_java.recursion;

import java.util.Scanner;

public class QuickSortUsingRecursion {
    static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {
        int size = s.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++)
            input[i] = s.nextInt();
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        quickSort(input);
        for (int i : input) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read arr, it is passed as function argument.
         * No need to print or return the output.
         * Taking arr and printing output is handled automatically.
         */
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        // your code goes here
        if (startIndex < endIndex) {
            int pi = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, pi - 1);
            quickSort(arr, pi + 1, endIndex);
        }
    }

    public static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int i = (startIndex - 1);

        for (int j = startIndex; j < endIndex; j++)
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }


        int temp = arr[i + 1];
        arr[i + 1] = arr[endIndex];
        arr[endIndex] = temp;

        return i + 1;
    }
}
