package coding_ninjas.introduction_to_java.tests.test2;

public class NumberInOutStarPattern {
    public static void main(String[] args) {
        // Write your code here
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= number; j++) {
                System.out.print(j > i ?  "*" : j);
            }
            for (int j = number; j >= 1; j--) {
                System.out.print(j > i ? "*" : j);
            }
            System.out.println();
        }
    }
}
