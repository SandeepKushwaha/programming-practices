package gfg.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>
 *  Problem Page: <a href="https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1">Union of Two Arrays</a>
 * </p>
 * */
public class Array_UnionOfTwoArrays {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] arrayLengthStr = reader.readLine().trim().split(" ");
            int n = Integer.parseInt(arrayLengthStr[0]);
            int m = Integer.parseInt(arrayLengthStr[1]);
            if (n>0 && m>0 && n<=100000 && m<=100000) {
                Integer[] a = new Integer[n];
                Integer[] b = new Integer[m];
                String[] aStr = reader.readLine().trim().split(" ");
                String[] bStr = reader.readLine().trim().split(" ");

                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(aStr[i]);
                }
                for (int i = 0; i < m; i++) {
                    b[i] = Integer.parseInt(bStr[i]);
                }

                int result = doUnion(a, n, b, m);
                System.out.println(result);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int doUnion(Integer[] a, int ignoredN, Integer[] b, int ignoredM) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.stream(a).toList());
        list.addAll(Arrays.stream(b).toList());

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer item: list) {
            if (item>=0 && item<=100000) {
                if(!newList.contains(item)) {
                    newList.add(item);
                }
            } else {
                throw new Error("Ai or Bi is out of bound must contains: 0 ≤ a[i], b[i] < 10^5");
            }
        }


        return newList.size();
    }
}
