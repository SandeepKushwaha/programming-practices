package coding_ninjas.introduction_to_java.patterns.shapes;

import java.util.Scanner;

public class Pattern_DiamondOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int number = scanner.nextInt();
            printDiamondOfStars(number);
        }
    }

    private static void printDiamondOfStars(int number) {
        if (number >= 1 && number <= 49) {
            if (number % 2 == 1) {
                if (number == 1) {
                    System.out.println('*');
                    return;
                }
                // ---------------  top section  ---------------
                // it should be (n+1)2
                for (int i = 1; i <= (number + 1) / 2; i++) {
                    // spaces
                    for (int j = 1; j < (number + 1) / 2 - i + 1; j++) {
                        System.out.print(" ");
                    }
                    // stars
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                // --------------- bottom section ---------------
                // it should be n/2
                for (int i = (number/2); i >= 1; i--) {
                    // spaces
                    for (int j = 1; j <= (number/2) - i + 1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
            }
        }
    }
}
