package coding_ninjas.introduction_to_java.operators_and_for_loop;

public class BinaryToDecimal {

    public static void main(String[] args) {
        // Given a binary number as an integer N, convert it into decimal and print.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        int decimal = 0;
        int base = 1;

        if (number >= 0 && number <= 1_000_000_000) {
            while (number > 0) {
                int last = number % 10;
                number /= 10;
                decimal += last * base;
                base *= 2;
            }

            System.out.println(decimal);
        }
    }
}
