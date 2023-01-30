package coding_ninjas.introduction_to_java.tests.course_test1;

import java.util.Scanner;

public class PatternRectangularNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        print(n);
        s.close();
    }
    public static void print(int n) {
        //Write your code here
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int min = Math.min(i, j);
                min = Math.min(min, 2 * n - i);
                min = Math.min(min, 2 * n - j);
                System.out.print(n - min + 1);
            }
            System.out.println();
        }
    }
}
