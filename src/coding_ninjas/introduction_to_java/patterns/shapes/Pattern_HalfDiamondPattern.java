package coding_ninjas.introduction_to_java.patterns.shapes;

import java.util.Scanner;

public class Pattern_HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int number = scanner.nextInt();
            printHalfDiamondPattern(number);
        }
        scanner.close();
    }

    private static void printHalfDiamondPattern(int number) {
        if(number >= 0 && number <= 50) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = number - 1; i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
