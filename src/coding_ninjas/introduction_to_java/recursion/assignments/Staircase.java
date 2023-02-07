package coding_ninjas.introduction_to_java.recursion.assignments;

import java.util.Scanner;

public class Staircase {

    public static int staircase(int n) {
        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (n == 0) return 1;
        else if (n < 0) return 0;
        else return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(staircase(n));
    }
}
