package coding_ninjas.introduction_to_java.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySort_0_1 {
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
            ArraySort_0_1_Solution.sortZeroesAndOne(input);
            printArray(input);
        }
    }

    private static class ArraySort_0_1_Solution {
        public static void sortZeroesAndOne(int[] arr) {
            //Your code goes here
            int countZero = 0;
            for (int i : arr)
                if (i == 0)
                    countZero++;

            for (int i = 0; i < countZero; i++)
                arr[i] = 0;

            for (int i = countZero; i < arr.length; i++)
                arr[i] = 1;
        }
    }
}
