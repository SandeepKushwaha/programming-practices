package coding_ninjas.introduction_to_java.tests.course_test1;

import java.util.Scanner;

public class FaultyKeyboard {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String typed = sc.next();
            String interpreted = sc.next();
            System.out.println(faultyKeyword(interpreted, typed));
        }
        sc.close();
    }

    static boolean faultyKeyword(String expected, String typed) {
        int i = 0, j = 0;
        while (i < expected.length() && j < typed.length()) {
            if (expected.charAt(i) == typed.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == expected.length();
    }
}
