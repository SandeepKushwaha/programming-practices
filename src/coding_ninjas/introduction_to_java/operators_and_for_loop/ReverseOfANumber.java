package coding_ninjas.introduction_to_java.operators_and_for_loop;

public class ReverseOfANumber {
    public static void main(String[] args) {
        // Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
        //        Note : If a number has trailing zeros, then its reverse will not include them.
        //        For e.g., reverse of 10400 will be 401 instead of 00401.

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 0 && number < 100_000_000) {
            int reverse = 0;
            while (number > 0) {
                reverse = (reverse * 10) + number % 10;
                number /= 10;
            }
            System.out.println(reverse);
        }
    }
}
