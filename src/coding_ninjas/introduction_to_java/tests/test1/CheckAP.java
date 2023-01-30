package coding_ninjas.introduction_to_java.tests.test1;

public class CheckAP {
    public static void main(String[] args) {
        // Write your code here
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
