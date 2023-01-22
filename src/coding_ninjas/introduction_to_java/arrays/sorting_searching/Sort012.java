package coding_ninjas.introduction_to_java.arrays.sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0)
            return input;

        String[] strNumbers;
        strNumbers = br.readLine().split("\\s");

        for (int i = 0; i < size; ++i)
            input[i] = Integer.parseInt(strNumbers[i]);

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {

            int[] input = takeInput();
            sort012(input);
            printArray(input);
        }

        // using sample method
        int[] sample = {1, 2, 0, 2, 1, 0, 0, 0, 1, 1, 2, 1};
        _sort012(sample);
        printArray(sample);
    }

    private static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }

    static void _sort012(int[] arr) {
        int zero = 0;
        int one = 0;
        for (int ele : arr) {
            if (ele == 0)
                zero++;
            else if (ele == 1) one++;
        }
        int two = arr.length - zero - one;
        for (int i = arr.length - two; i < arr.length; i++) {
            arr[i] = 2;
        }
        for (int i = arr.length - two - one; i < arr.length - two; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
    }
}
