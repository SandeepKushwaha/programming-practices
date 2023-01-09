package coding_ninjas.basic_of_java.methods;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120298/offering/1404438
 *
 * */

import java.util.Scanner;

class CountPrime {

    static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Write your totalPrime function here
    int totalPrime(int start, int end) {
        int results = 0;

        // loop start to end
        for (int index = start; index <= end; index++) {
            // check the index is prime or not
            // if prime then increment with 1 the result counter

            // checking the Constraint that 1 <= index <= 100
            if (index >= 1 && index <= 100) {
                if (index == 1) results++;
                if (isPrime(index)) results++;
            }
        }

        return results;

    }
}

public class TotalPrime {
    public static void main(String[] args) {
        CountPrime oCountPrime = new CountPrime();

        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(oCountPrime.totalPrime(start, end));
    }
}
