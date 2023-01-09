package coding_ninjas.introduction_to_java.patterns;

import java.util.Scanner;

public class Pattern_ReverseTriangularRowIncrementalCharacterNTo0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int number = scanner.nextInt();
            printReverseTriangularVerticalRowCharactersNTo0(number);
        }
    }

    private static void printReverseTriangularVerticalRowCharactersNTo0(int number) {
        if (number >= 0 && number <= 26) {
            for (int i = 1; i <= number; i++) {
                char character = (char) ('A' + number - i);
                for (int j = 1; j <= i; j++) {
                    System.out.print(character++);
                }
                System.out.println();
            }
        }
    }
}
