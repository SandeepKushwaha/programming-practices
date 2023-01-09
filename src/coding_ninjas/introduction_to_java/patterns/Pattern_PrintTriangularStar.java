package coding_ninjas.introduction_to_java.patterns;

import java.util.Scanner;

public class Pattern_PrintTriangularStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int number = scanner.nextInt();
            printTriangularStars(number);
        }
    }

    private static void printTriangularStars(int number) {
        if (number >= 0 && number <= 50) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
