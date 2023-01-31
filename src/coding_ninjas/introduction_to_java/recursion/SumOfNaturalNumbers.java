package coding_ninjas.introduction_to_java.recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    private static int sum(int number) {
        if (number == 0)
            return 0;

        return number + sum(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(sum(number));
    }
}
