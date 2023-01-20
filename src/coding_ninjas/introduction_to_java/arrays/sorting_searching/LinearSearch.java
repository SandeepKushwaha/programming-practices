package coding_ninjas.introduction_to_java.arrays.sorting_searching;

import java.util.Scanner;

public class LinearSearch {
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

                System.out.println(linearSearch(arr, searchElement));
            }
        }
    }

    private static int linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
