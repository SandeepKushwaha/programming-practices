package coding_ninjas.introduction_to_java.arrays.sorting_searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestElement {
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
            int ans = SecondLargestElement.secondLargestElement(input);
            System.out.println(ans);
        }
    }

    private static int secondLargestElement(int[] arr) {
        //Your code goes here
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = i;
            } else if (i > secondLargest && i != firstLargest) {
                secondLargest = i;
            }
        }
        if (secondLargest == Integer.MIN_VALUE || arr.length == 1)
            return Integer.MIN_VALUE;
        else
            return secondLargest;
    }


}
