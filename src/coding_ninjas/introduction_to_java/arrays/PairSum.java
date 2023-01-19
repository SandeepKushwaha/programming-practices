package coding_ninjas.introduction_to_java.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PairSum {
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
            int x = Integer.parseInt(br.readLine().trim());
            System.out.println(PairSumSolution.pairSum(input, x));
        }
    }

    static class PairSumSolution {
        public static int pairSum(int[] arr, int x) {
            int counter = 0;

            for (int i = 0; i < arr.length; i++)
                for (int j = i; j < arr.length; j++)
                    if (i != j && (arr[i] + arr[j] == x))
                        counter++;

            return counter;
        }
    }
}
