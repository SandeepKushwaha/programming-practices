package coding_ninjas.introduction_to_java.patterns.shapes;

import java.util.Scanner;

public class Pattern_InvertedTriangleNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int number = scanner.nextInt();
            printInvertedTriangularNTo1(number);
        }
    }

    private static void printInvertedTriangularNTo1(int number) {
        if (number >= 0 && number <= 50) {
            for (int i = 1; i <= number; i++) {
                for (int space = number - i + 1; space >= 1; space--) {
                    System.out.print(number-i+1);
                }
                System.out.println();
            }
        }
    }
}
