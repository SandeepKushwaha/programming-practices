package coding_ninjas.data_structures_in_java.recursion;

import java.util.Scanner;

public class FindFactorial {

    private static int factorial(int number) {
        if (number == 0)
            return 1;

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(factorial(number));
    }
}
