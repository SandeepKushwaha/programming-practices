package coding_ninjas.introduction_to_java.section_tests;

public class NumberStarPattern {

    public static void main(String[] args) {
        // Print the following pattern for given number of rows.
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int number = sc.nextInt();

        for (int i = number; i >= 1; i--) {
            for (int j = number; j >= 1; j--) {
                System.out.print(j == number - i + 1 ? "*" : j);
            }
            System.out.println();
        }
    }
}
