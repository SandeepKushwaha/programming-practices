package coding_ninjas.introduction_to_java.time_complexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEquilibriumIndex {
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
            int[] arr = takeInput();
            System.out.println(arrayEquilibriumIndex(arr));
        }
    }

    private static int arrayEquilibriumIndex(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int j : arr)
            sum += j;

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (leftSum == sum)
                return i;
            leftSum += arr[i];
        }
        return -1;
    }
}
