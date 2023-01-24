package coding_ninjas.introduction_to_java.arrays.two_d_arrays;

import java.util.Scanner;

public class LargestColumnSum {

    public static int[][] take2DArrayInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number for column: ");
        int column = scanner.nextInt();

        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the element for position " + i + " row and " + j + " column : ");
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static int largestColumnSum(int[][] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
            if (largest < sum)
                largest = sum;
        }
        return largest;
    }

    public static void main(String[] args) {
        // User defined 2d-array
        int[][] arr = take2DArrayInput();
        int largeColumnSum = largestColumnSum(arr);
        System.out.println(largeColumnSum);


        int[][] sampleArr = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}, {4, 5, 6, 7}};
        int sampleLargeColumnSum = largestColumnSum(sampleArr);
        System.out.println(sampleLargeColumnSum);
    }
}
