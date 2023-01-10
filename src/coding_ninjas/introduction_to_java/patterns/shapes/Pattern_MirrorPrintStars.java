package coding_ninjas.introduction_to_java.patterns.shapes;

import java.util.Scanner;

public class Pattern_MirrorPrintStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int number = scanner.nextInt();
            printMirrorStars(number);
        }
    }

    private static void printMirrorStars(int number) {
        if (number >= 0 && number <= 50) {
            for (int i = 1; i <= number; i++) {
                for (int space = 1; space <= number - i; space++) {
                    System.out.print(" ");
                }
                for (int star = 1; star <= i; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
