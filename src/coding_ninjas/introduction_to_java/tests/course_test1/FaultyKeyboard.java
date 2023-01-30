package coding_ninjas.introduction_to_java.tests.course_test1;

import java.util.Scanner;

public class FaultyKeyboard {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String typed = sc.next();
            String interpreted = sc.next();

            System.out.println(faultyKeyword(interpreted, typed));
        }
        sc.close();
    }

    static boolean faultyKeyword(String expected, String typed) {
        int i = 0;
        int j = 0;
        int n = typed.length();
        char temp = expected.charAt(0);

        while (i < n) {
            if (typed.charAt(i) == expected.charAt(j)) {
                temp = expected.charAt(j);
                j++;
                i++;
            } else if (typed.charAt(i) != expected.charAt(j) && typed.charAt(i) == temp) {
                i++;
            } else {
                return false;
            }
        }

        return j == expected.length();
    }
}
