package coding_ninjas.introduction_to_java.operators_and_for_loop;

public class DecimalToBinary {
    public static void main(String[] args) {
        // Given a decimal number (integer N), convert it into binary and print.
        // The binary number should be in the form of an integer.
        //
        // Note: The given input number could be large, so the corresponding binary number can exceed the integer range.
        // So you may want to take the answer as long for CPP and Java.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();

        int[] binaryNumber = new int[32];

        if (number == 0)
            System.out.println(0);

        int i = 0;
        while (number > 0) {
            binaryNumber[i] = number % 2;
            number /= 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNumber[j]);
        }
    }
}
