package coding_ninjas.data_structures_in_java.recursion.assignments;

import java.util.Scanner;

public class Multiplication {
    public static int multiplyTwoIntegers(int m, int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        // recursive case
        return m + multiplyTwoIntegers(m, n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(multiplyTwoIntegers(m, n));
    }
}
