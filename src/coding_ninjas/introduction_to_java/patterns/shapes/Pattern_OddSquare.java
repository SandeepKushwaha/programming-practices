package coding_ninjas.introduction_to_java.patterns.shapes;

public class Pattern_OddSquare {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int number = scanner.nextInt();
            printOddSquare(number);
        }
        scanner.close();
    }

    public static void printOddSquare(int number) {
        if (number >= 0 && number <= 50) {
            for (int i = 1; i <= number; i++) {
                // print incremental element
                // now we need to start ith - 1 to N where every element twice - 1 is odd
                for (int j = i - 1; j < number; j++) {
                    System.out.print(j * 2 + 1);
                }
                // print decrement element
                // now we need to do not start with first row that's why start with 0 to n - 1
                for (int j = 0; j < i - 1; j++) {
                    System.out.print(j * 2 + 1);
                }
                System.out.println();
            }
        }
    }


}
