package coding_ninjas.introduction_to_java.operators_and_for_loop;

public class SquareRootOfInteger {
    public static void main(String[] args) {
        // Given a number N, find its square root.
        // You need to find and print only the integral part of square root of N.
        //
        // For e.g. if number given is 18, answer is 4.

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 0 && number <= 100_000_000) {
            if (number == 0 || number == 1)
                System.out.println(number);
            else {
                int result = 1, i = 1;
                while (result <= number) {
                    i++;
                    result = i * i;
                }
                System.out.println(i - 1);
            }
        }

        scanner.close();
    }
}
