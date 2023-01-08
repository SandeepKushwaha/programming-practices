package coding_ninjas.basic_of_java.control_statements;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1459170
 *
 * */

import java.util.Scanner;

public class FindPowerOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();

        if (base >= 0 && base <= 8 && power >= 0 && power <= 9) {
            System.out.println((int) Math.pow(base, power));
        }

    }
}
