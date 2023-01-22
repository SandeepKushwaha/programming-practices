package coding_ninjas.introduction_to_java.arrays.sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArray {

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
            int d = Integer.parseInt(br.readLine().trim());
            RotateArraySolution.rotate(input, d);
            printArray(input);
        }
    }

    static class RotateArraySolution {
        /* Time Limit exceed
        public static void rotate(int[] arr, int d) {
            //Your code goes here
            while (d-- > 0) {
                for (int i = 0; i < arr.length - 1; i++) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        */

        public static void rotate(int[] arr, int duration) {
            int n = arr.length;
            reverse(arr, 0, duration - 1);
            reverse(arr, duration, n - 1);
            reverse(arr, 0, n - 1);
        }

        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
