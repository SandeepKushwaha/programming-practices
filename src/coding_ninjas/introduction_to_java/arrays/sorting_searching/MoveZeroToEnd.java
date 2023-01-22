package coding_ninjas.introduction_to_java.arrays.sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoveZeroToEnd {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) return input;

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
            int[] input = takeInput();
            MoveZeroToEndSolution.pushZerosAtEnd(input);
            printArray(input);
        }
    }

    static class MoveZeroToEndSolution {
        public static void pushZerosAtEnd(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++)
                if (arr[i] != 0)
                    arr[count++] = arr[i];

            while (count < arr.length) {
                arr[count++] = 0;
            }
        }
    }
}
