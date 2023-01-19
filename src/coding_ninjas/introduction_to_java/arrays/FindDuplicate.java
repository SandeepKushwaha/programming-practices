package coding_ninjas.introduction_to_java.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicate {
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


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int[] input = takeInput();
            System.out.println(FindDuplicateSolution.duplicateNumber(input));
        }
    }

    private static class FindDuplicateSolution {
        public static int duplicateNumber(int[] arr) {
            // A Normal Approach for finding duplicate
            for (int k : arr) {
                short isFound = -1;
                for (int i : arr) {
                    if (k == i) {
                        isFound++;
                    }
                }
                if (isFound == 1) return k;
            }
            return 0;
        }
    }
}
