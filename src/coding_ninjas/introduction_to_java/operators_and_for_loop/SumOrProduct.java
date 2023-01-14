package coding_ninjas.introduction_to_java.operators_and_for_loop;

public class SumOrProduct {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        int choice = scanner.nextInt();

        if (number > 0 && number <= 12)
            switch (choice) {
                case 1 -> {
                    int sum = 0;
                    for (int i = 1; i <= number; i++) {
                        sum += i;
                    }
                    System.out.println(sum);
                }
                case 2 -> {
                    int product = 1;
                    for (int i = 1; i <= number; i++) {
                        product *= i;
                    }
                    System.out.println(product);
                }
                default -> System.out.println(-1);
            }

        /* java version less than 11
            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int i = 1; i <= number; i++) {
                        sum += i;
                    }
                    System.out.println(sum);
                    break;

                case 2:
                    int product = 1;
                    for (int i = 1; i <= number; i++) {
                        product*=i;
                    }
                    System.out.println(product);
                    break;

                default:
                    System.out.println(-1);
            }
        */
    }
}
