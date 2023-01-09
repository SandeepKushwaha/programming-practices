package coding_ninjas.introduction_to_java.patterns;

import java.util.Scanner;

public class Pattern_TriangularVerticalRowIncrementalCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int number = scanner.nextInt();
            printTriangularVerticalRowCharacters(number);
        }
    }

    private static void printTriangularVerticalRowCharacters(int number) {
        if (number >= 0 && number <= 26) {
            for (int i = 1; i <= number; i++) {
                char character = (char) ('A' + i - 1);
                for (int j = 1; j <= i; j++) {
                    System.out.print(character++);
                }
                System.out.println();
            }
        }
    }
}
