package coding_ninjas.introduction_to_java.arrays.sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckArrayRotation {
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

        while(t-- > 0) {
            int[] input = takeInput();
            int ans = arrayRotateCheck(input);
            System.out.println(ans);
        }
    }

    private static int arrayRotateCheck(int[] arr) {
        int rotation = 0;
        boolean isFoundPartition = false;
        for (int i = arr.length - 1; i > 0; i--) {
            if (isFoundPartition) {
                rotation++;
            }
            if (arr[i] < arr[i - 1]) {
                rotation++;
                isFoundPartition = true;
            }
        }
        return rotation;

        /* using Divide and concur method
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid < n - 1 && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            } else if (arr[left] <= arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
        */
    }
}
