package coding_ninjas.introduction_to_java.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntersectionOfTwoArray {
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


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int[] input1 = takeInput();
            int[] input2 = takeInput();
            IntersectionOfTwoArraySolution.intersections(input1, input2);
            System.out.println();
        }
    }

    static class IntersectionOfTwoArraySolution {

        public static void intersections(int[] arr1, int[] arr2) {
            for (int k : arr1) {
                for (int j = 0; j < arr2.length; j++) {
                    if (k == arr2[j]) {
                        System.out.print(k + " ");
                        arr2[j] = Integer.MAX_VALUE;
                        break;
                    }
                }
            }
        }
    }
}
