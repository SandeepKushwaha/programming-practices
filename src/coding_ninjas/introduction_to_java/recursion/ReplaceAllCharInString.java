package coding_ninjas.introduction_to_java.recursion;

import java.util.Scanner;

public class ReplaceAllCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            String str = scanner.next();
            char oldChar = scanner.next().charAt(0);
            char newChar = scanner.next().charAt(0);
            System.out.println(replaceAllChar(str, oldChar, newChar));
        }
    }

    private static String replaceAllChar(String str, char oldChar, char newChar) {
        if (str.length() == 0)
            return str;

        char firstChar = str.charAt(0);
        char replacedFirstChar = firstChar == oldChar ? newChar : firstChar;

        String replacedRest = replaceAllChar(str.substring(1), oldChar, newChar);

        return replacedFirstChar + replacedRest;
    }
}
