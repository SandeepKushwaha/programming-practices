package coding_ninjas.basic_of_java.methods;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120298/offering/1404437
 *
 * */

import java.util.Scanner;

public class SetBits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        while (testCase-- > 0) {
            int number = scanner.nextInt();
            System.out.println(countSetBits(number));
        }
    }

    public static int countSetBits(int n) {
        // Write your code here.
        int count = 0;
        if (n > 0 && n <= 100) {
            while (n > 0) {
                count += n & 1;
                /* check with 1 then increment counter
                if ((n & 1) == 1)
                    count++;
                */
                n >>= 1;
            }
        }
        return count;
    }
}
