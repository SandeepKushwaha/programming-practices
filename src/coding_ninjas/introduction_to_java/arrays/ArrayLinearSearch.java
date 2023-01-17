package coding_ninjas.introduction_to_java.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayLinearSearch {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNumbers = br.readLine().split("\\s");


        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNumbers[i]);
        }

        return input;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        if (t > 0 && t <= 100)
            while (t > 0) {
                int[] input = takeInput();
                int val = Integer.parseInt(br.readLine().trim());
                System.out.println(ArrayLinearSearchSolution.linearSearch(input, val));

                t -= 1;
            }
    }
}

class ArrayLinearSearchSolution {
    public static int linearSearch(int[] arr, int x) {

        if (arr.length > 0 && arr.length <= 100_000)
            for (int i = 0; i < arr.length; i++)
                if (arr[i] > Integer.MIN_VALUE)
                    if (arr[i] == x) return i;

        return -1;
    }
}