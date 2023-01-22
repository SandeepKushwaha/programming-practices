package coding_ninjas.introduction_to_java.arrays.sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeTwoSortedArrays {
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
        for (int element : arr)
            System.out.print(element + " ");

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int[] input1 = takeInput();
            int[] input2 = takeInput();
            int[] ans = MergeTwoSortedArraysSolution.merge(input1, input2);
            printArray(ans);
        }
    }

    private static class MergeTwoSortedArraysSolution {
        public static int[] merge(int[] arr1, int[] arr2) {
            int[] result = new int[arr1.length + arr2.length];
            int i = 0, j = 0, k = 0;

            while (i < arr1.length && j < arr2.length)
                if (arr1[i] < arr2[j])
                    result[k++] = arr1[i++];
                else
                    result[k++] = arr2[j++];

            while (i < arr1.length)
                result[k++] = arr1[i++];

            while (j < arr2.length)
                result[k++] = arr2[j++];

            return result;
        }
    }
}
