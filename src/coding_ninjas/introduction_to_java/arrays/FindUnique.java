package coding_ninjas.introduction_to_java.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindUnique {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) return input;

        String[] strNumbers;
        strNumbers = br.readLine().split("\\s");

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNumbers[i]);
        }

        return input;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int[] input = takeInput();
            System.out.println(FindUniqueSolution.findUnique(input));
        }
    }

    private static class FindUniqueSolution {
        public static int findUnique(int[] arr) {
            // Your code goes here.
            for (int i : arr) {
                int isFound = -1;
                for (int j : arr) {
                    if (i == j) {
                        isFound++;
                    }
                }
                if (isFound == 0)
                    return i;
            }
            return arr[0];
        }
    }
}
