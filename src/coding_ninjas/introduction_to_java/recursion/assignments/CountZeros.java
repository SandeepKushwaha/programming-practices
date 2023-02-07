package coding_ninjas.introduction_to_java.recursion.assignments;

import java.util.Scanner;

public class CountZeros {
    public static int countZeroRecursive(int number) {
        if (number == 0)
            return 1;

        if (number < 10)
            return 0;

        if (number % 10 == 0)
            return 1 + countZeroRecursive(number / 10);

        return countZeroRecursive(number / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(countZeroRecursive(number));
    }
}
