package gfg.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Problem page:  <a href="https://practice.geeksforgeeks.org/problems/minimum-product-pair3608/1">Minimum Product pair of a Array</a>
 *
 */
public class Array_MinimumProductPair {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(reader.readLine().trim());
            String[] inputString = reader.readLine().trim().split(" ");
            if (n>=2 && n<=100000) {
                if (n%2 == 0) {
                    Integer[] a = new Integer[inputString.length];
                    for (int i = 0; i < inputString.length; i++) {
                        int temp = Integer.parseInt(inputString[i]);
                        if (temp > 0 && temp <= 100000) {
                            a[i] = temp;
                        } else {
                            throw new Error("A[i] is must be 1<=A[i]<=10^5");
                        }
                    }
                    printMinimumProduct(a);
                } else {
                    throw new Error("input for n is odd.\nPlease Enter n => 2<=N<=10^5");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printMinimumProduct(Integer[] a) {
        // sort the array.
        Integer[] result = Arrays.stream(a).sorted(Integer::compare).toArray(Integer[]::new);
        System.out.println(result[0] * result[1]);
    }
}
