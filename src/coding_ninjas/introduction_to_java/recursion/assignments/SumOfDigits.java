package coding_ninjas.introduction_to_java.recursion.assignments;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(int input) {
        // Write your code here
        if (input <= 0)
            return 0;

        return input % 10 + sumOfDigits(input / 10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
