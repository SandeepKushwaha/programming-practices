package coding_ninjas.basic_of_java.control_statements;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1459167
 *
 * */

import java.io.IOException;
import java.util.Scanner;

import static java.util.stream.IntStream.iterate;

public class SumOfEvenNumbersTillN {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int number = scanner.nextInt();
            System.out.println(evenSumTillN(number));
        }
    }

    public static long evenSumTillN(int n) {
        /* Using Tradition loop
        long sum = 0;
        for (int i = 2; i <= n; i+=2) {
            sum+=i;
        }
        return sum;
        */
        return iterate(2, i -> i <= n, i -> i + 2).asLongStream().sum();
    }
}
