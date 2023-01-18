package coding_ninjas.introduction_to_java.arrays;

import java.util.Scanner;

public class PrintAllPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        printArrayPairs(array);
    }

    public static void printArrayPairs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + "), ");
            }
            System.out.println();
        }
    }
}
