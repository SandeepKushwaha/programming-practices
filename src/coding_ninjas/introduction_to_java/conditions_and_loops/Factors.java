package coding_ninjas.introduction_to_java.conditions_and_loops;

public class Factors {

    public static void main(String[] args) {
        // Write your code here
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int number = scanner.nextInt();

        // checking the constraints
        if (number >= 0 && number <= 10_000) {

            // checking the divisible of number and then printing the divisible
            int div = 2;

            while (div <= number / 2) {
                if (number % div == 0) {
                    System.out.print(div + " ");
                }
                div++;
            }
        }
    }
}
