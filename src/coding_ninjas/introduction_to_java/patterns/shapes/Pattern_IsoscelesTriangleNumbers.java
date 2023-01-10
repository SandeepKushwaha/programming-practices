package coding_ninjas.introduction_to_java.patterns.shapes;

import java.util.Scanner;

public class Pattern_IsoscelesTriangleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int number = scanner.nextInt();
            printIsoscelesTriangleNumbers(number);
        }
    }

    private static void printIsoscelesTriangleNumbers(int number) {
        if (number >= 0 && number <= 50) {
            for (int i = 1; i <= number; i++) {
                // printing the spaces
                for (int j = 1; j <= number - i; j++) {
                    System.out.print(" ");
                }
                // printing the incremental number in the order of 1 to column index
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                // printing the decremental number in order of max column index to 1
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
