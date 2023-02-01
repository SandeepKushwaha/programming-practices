package coding_ninjas.introduction_to_java.recursion;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
    }

    private static int count(int n) {
        if (n == 0)
            return 0;

        return 1 + count(n / 10);
    }


}
