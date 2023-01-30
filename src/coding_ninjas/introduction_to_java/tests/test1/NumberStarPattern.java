package coding_ninjas.introduction_to_java.tests.test1;

public class NumberStarPattern {
    public static void main(String[] args) {
        // Write your code here
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
