package coding_ninjas.introduction_to_java.patterns.shapes;

import java.util.Scanner;

public class Pattern_HalfDiamondPatternNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int number = scanner.nextInt();
            printHalfDiamondPatternNumbers(number);
        }
        scanner.close();
    }

    private static void printHalfDiamondPatternNumbers(int number) {
        if(number >= 0 && number <= 50) {
            System.out.println("*");
            for (int i = 1; i <= number; i++) {
                int j = 1;
                System.out.print("*");
                while (j <= i)
                    System.out.print(j++);
                j--;
                while (--j >= 1)
                    System.out.print(j);
                System.out.println("*");
            }
            for (int i = number - 1; i >= 1; i--) {
                int j = 1;
                System.out.print("*");
                while (j <= i)
                    System.out.print(j++);
                j--;
                while (--j >= 1)
                    System.out.print(j);
                System.out.println("*");
            }
            System.out.println("*");
        }
    }
}
