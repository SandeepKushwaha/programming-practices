package coding_ninjas.introduction_to_java.patterns.shapes;

public class Pattern_SumElementPattern {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int number = scanner.nextInt();
            printSumPattern(number);
        }
        scanner.close();
    }

    public static void printSumPattern(int number) {
        if (number >= 0 && number <= 50) {
            for (int i = 1; i <= number; i++) {
                int sum = 0;
                for (int j = 1; j <= i; j++) {
                    sum += j;
                    System.out.print(j);
                    if (j < i)
                        System.out.print("+");
                }
                System.out.print("=" + sum + "\n");
            }
        }
    }


}
