package coding_ninjas.introduction_to_java.recursion;

import java.util.Scanner;

public class ReplacePiTo314InString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            String str = scanner.next();
            System.out.println(replacePi(str));
        }
    }

    private static String replacePi(String str) {
        if (str.length() <= 1) return str;

        if ((str.charAt(0) == 'p' || str.charAt(0) == 'P') && (str.charAt(1) == 'i' || str.charAt(0) == 'I'))
            return "3.14" + replacePi(str.substring(2));
        else return str.charAt(0) + replacePi(str.substring(1));
    }
}
