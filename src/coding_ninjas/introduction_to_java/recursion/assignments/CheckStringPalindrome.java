package coding_ninjas.introduction_to_java.recursion.assignments;

import java.util.Scanner;

public class CheckStringPalindrome {

    public static boolean isStringPalindrome(String input) {
        // Write your code here
        return isStringPalindrome(input, 0, input.length() - 1);
    }

    public static boolean isStringPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isStringPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(isStringPalindrome(input));
    }
}
