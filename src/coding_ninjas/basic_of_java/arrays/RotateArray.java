package coding_ninjas.basic_of_java.arrays;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120299/offering/1459177
 *
 * */

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int rotates = scanner.nextInt();

        while (rotates-- > 0) {
            for (int i = 0; i < array.length - 1; i++) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
