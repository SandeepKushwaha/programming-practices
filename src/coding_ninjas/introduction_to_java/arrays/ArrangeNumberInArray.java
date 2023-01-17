package coding_ninjas.introduction_to_java.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangeNumberInArray {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            ArrangeNumberArraySolution.arrange(arr, n);
            printArray(arr);

            t -= 1;
        }
    }
}

class ArrangeNumberArraySolution {

    public static void arrange(int[] arr, int n) {

        if (n >= 0 && n <= 10_000) {
            int position = 1;
            for (int i = 0; i < arr.length; i++) {
                if (arr.length%2 == 0) {
                    if (i < arr.length / 2)
                        arr[i] = (position += 2) - 2;
                    else
                        arr[i] = (position -= 2) + 1;
                } else {
                    if (i <= arr.length / 2)
                        arr[i] = (position += 2) - 2;
                    else
                        arr[i] = (position -= 2) - 1;
                }
            }
        }
    }
}
