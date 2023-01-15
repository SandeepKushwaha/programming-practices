package coding_ninjas.introduction_to_java.section_tests;

public class CheckAP {

    public static void main(String[] args) {
        // Given input consists of n numbers.
        // Check whether those n numbers form an arithmetic progression or not. Print true or false.
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int number = scanner.nextInt();

        int[] numbers = new int[number];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean isAP = true;

        int d = numbers[1] - numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (d != (numbers[i + 1] - numbers[i])) {
                isAP = false;
                break;
            }
        }

        System.out.print(isAP);
    }
}
