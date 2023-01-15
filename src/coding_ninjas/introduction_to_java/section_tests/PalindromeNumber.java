package coding_ninjas.introduction_to_java.section_tests;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Write a program to determine if given number is palindrome or not.
        // Print true if it is palindrome, false otherwise.
        // Palindrome are the numbers for which reverse is exactly same as the original one. For e.g. 121

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int reverse = 0;

        while (temp > 0) {
            reverse = (reverse * 10) + temp % 10;
            temp /= 10;
        }

        if (reverse == number) System.out.println("true");
        else System.out.println("false");
    }
}
