package coding_ninjas.introduction_to_java.operators_and_for_loop;

public class TermsOfAP {
    public static void main(String[] args) {
        // Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; count < number; i++) {
            int term = 3 * i + 2;
            if (term%4 != 0) {
                System.out.print(term + " ");
                count++;
            }
        }
    }
}
