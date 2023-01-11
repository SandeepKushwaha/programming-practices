package coding_ninjas.introduction_to_java.patterns.shapes;

public class Pattern_ParallelogramStars {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int number = scanner.nextInt();
            printParallelogramStars(number);
        }
        scanner.close();
    }

    public static void printParallelogramStars(int number) {
        if (number >= 0 && number <= 50) {
            for (int i = 1; i <= number; i++) {
                // print space
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                // print star
                for (int j = 1; j <= number; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


}
