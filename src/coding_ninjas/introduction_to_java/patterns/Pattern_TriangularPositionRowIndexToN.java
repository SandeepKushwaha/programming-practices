package coding_ninjas.introduction_to_java.patterns;

import java.util.Scanner;

public class Pattern_TriangularPositionRowIndexToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int number = scanner.nextInt();
            printNumbersTriangularPositionUpToN(number);
        }
    }

    private static void printNumbersTriangularPositionUpToN(int number) {
        if (number >= 0 && number <= 50) {
            int position;
            for (int i = 1; i <= number; i++) {
                position = i;
                for (int j = 1; j <= i; j++) {
                    System.out.print(position++ + " ");
                }
                System.out.println();
            }
        }
    }
}
