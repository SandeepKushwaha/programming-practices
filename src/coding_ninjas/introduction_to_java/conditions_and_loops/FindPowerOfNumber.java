package coding_ninjas.introduction_to_java.conditions_and_loops;

import java.util.Scanner;

public class FindPowerOfNumber  {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = scanner.nextInt();

        // for x^n checking the constraints and printing the result
        if (x >= 0 && x <= 8 && n >= 0 && n <= 9) {
            System.out.println((int)Math.pow(x, n));
        }
    }
}
