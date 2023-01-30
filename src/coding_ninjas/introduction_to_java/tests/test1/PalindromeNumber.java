package coding_ninjas.introduction_to_java.tests.test1;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Write your code here
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int reverse = 0;

        while (temp > 0) {
            reverse = (reverse * 10) + temp % 10;
            temp /= 10;
        }

        if (reverse == number) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
