package coding_ninjas.data_structures_in_java.recursion;

import java.util.Scanner;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(isArraySorted(arr));
    }

    private static boolean isArraySorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return (arr[index] <= arr[index + 1]) && isArraySorted(arr, index + 1);
    }

    public static boolean isArraySorted(int[] arr) {
        return isArraySorted(arr, 0);
    }


    /* Normal Way to solve the problem with recursion
    private static boolean isArraySorted(int[] arr) {
        if (arr.length == 1)
            return true;

        if (arr[0] > arr[1]) {
            return false;
        }

        int[] smallArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, smallArr, arr.length - 1, arr.length);

        return isArraySorted(smallArr);
    }
    */
}
