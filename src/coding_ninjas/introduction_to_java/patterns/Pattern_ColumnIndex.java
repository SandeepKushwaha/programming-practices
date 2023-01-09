package coding_ninjas.introduction_to_java.patterns;

import java.util.Scanner;

public class Pattern_ColumnIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int number = scanner.nextInt();
            printNumbersColumnIndex(number);
        }
    }

    private static void printNumbersColumnIndex(int number) {
        if (number >= 0 && number <= 50) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
