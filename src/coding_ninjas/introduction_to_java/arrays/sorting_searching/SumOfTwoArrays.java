package coding_ninjas.introduction_to_java.arrays.sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwoArrays {

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

            int[] arr1 = takeInput();
            int[] arr2 = takeInput();

            int[] output = new int[1 + Math.max(arr1.length, arr2.length)];
            sumOfTwoArrays(arr1, arr2, output);
            printArray(output);
        }

        int[] sampleArr1 = {1, 2, 7, 5, 8};
        int[] sampleArr2 = {8, 9, 1, 1, 7, 4};
        int[] sampleOutput = new int[1 + Math.max(sampleArr1.length, sampleArr2.length)];
        _sumOfTwoArrays(sampleArr1, sampleArr2, sampleOutput);
        printArray(sampleOutput);
    }

    static public void sumOfTwoArrays(int[] arr1, int[] arr2, int[] output) {
        int n = arr1.length;
        int m = arr2.length;
        int i = n - 1, j = m - 1, k = Math.max(n, m);
        int carry = 0;
        while (k > 0) {
            int x = i >= 0 ? arr1[i--] : 0;
            int y = j >= 0 ? arr2[j--] : 0;
            int sum = x + y + carry;
            output[k--] = sum % 10;
            carry = sum / 10;
        }
        output[0] = carry;
    }

    public static void _sumOfTwoArrays(int[] arr1, int[] arr2, int[] output) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        int k = Math.max(arr1.length, arr2.length);
        while(i >= 0 && j >= 0) {
            int sum = arr1[i--] + arr2[j--] + carry;
            output[k--] = sum % 10;
            carry = sum / 10;
        }
        while(i >= 0) {
            int sum = arr1[i--] + carry;
            output[k--] = sum % 10;
            carry = sum / 10;
        }
        while(j >= 0) {
            int sum = arr2[j--] + carry;
            output[k--] = sum % 10;
            carry = sum / 10;
        }
        output[0] = carry;
    }
}
