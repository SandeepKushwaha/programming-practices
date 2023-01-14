package coding_ninjas.introduction_to_java.operators_and_for_loop;

public class AllPrimeNumbers {

    static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    static void allPrime(int end) {

        // loop start to end
        for (int index = 1; index <= end; index++) {
            // check the index is prime or not
            // if prime then increment with 1 the result counter

            // checking the Constraint that 1 <= index <= 100
            if (index >= 2 && index <= 100) {
                if (isPrime(index))
                    System.out.println(index);
            }
        }
    }

    public static void main(String[] args) {
        // Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
        // Print the prime numbers in different lines.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        allPrime(number);
    }
}
