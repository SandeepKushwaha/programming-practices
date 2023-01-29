package coding_ninjas.introduction_to_java.time_complexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PairSumInArray {
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
            int num = Integer.parseInt(br.readLine().trim());
            System.out.println(pairSum(arr, num));
        }
    }

    private static int pairSum(int[] arr, int num) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        int count = 0;
        for (int i : arr) {
            if (map.containsKey(num - i))
                count += map.get(num - i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return count;
    }
}
