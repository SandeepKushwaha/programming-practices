package coding_ninjas.introduction_to_java.arrays.two_d_arrays;

import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int[] arr1d = new int[10];
        // assign and printing at the same time
        for (int i = 0; i < arr1d.length; i++) {
            arr1d[i] = (i + 1) * 2;
            System.out.println(arr1d[i]);
        }
        System.out.println();

        int[][] arr2d = new int[4][4]; // row and column

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d.length; j++) {
                arr2d[i][j] = (i + 1) * (j + 1);
                System.out.print(arr2d[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr = {{1, 2, 3, 4, 5, 6}, {2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4}};

        System.out.println(arr);
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[0].length);
        System.out.println(arr[1]);
        System.out.println(arr[1].length);
        System.out.println(arr[2]);
        System.out.println(arr[2].length);

        System.out.println();
        int[][] sample = {};

        System.out.println(sample);
        System.out.println(Arrays.deepToString(sample));
        System.out.println(sample.length);
        System.out.println();

        int[][] only1DDefined = new int[2][];

        System.out.println(only1DDefined);
        System.out.println(only1DDefined.length);
        System.out.println(only1DDefined[0]);
        System.out.println(only1DDefined[1]);
    }
}
