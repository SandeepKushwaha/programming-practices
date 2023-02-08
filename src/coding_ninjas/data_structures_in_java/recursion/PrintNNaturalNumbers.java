package coding_ninjas.data_structures_in_java.recursion;

import java.util.Scanner;

public class PrintNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printNaturalNumbers(number);
    }

    private static void printNaturalNumbers(int number) {
        if (number == 0)
            return;
        printNaturalNumbers(number - 1);
        System.out.print(number + " ");
    }
}
