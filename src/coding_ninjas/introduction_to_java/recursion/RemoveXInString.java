package coding_ninjas.introduction_to_java.recursion;

import java.util.Scanner;

public class RemoveXInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(removeX(input));

        System.out.println("My test cases if following \nOnly one test case is failing with other method.");
        int requiredOptimize = s.nextInt();
        boolean optimize = requiredOptimize > 1;
        System.out.println(removeX(input, optimize));
    }

    public static String removeX(String s) {
        if (s.length() == 0) {
            return "";
        }
        String res = removeX(s.substring(1));
        if (s.charAt(0) == 'x') {
            return res;
        } else {
            return s.charAt(0) + res;
        }
    }

    private static String removeX(String input, boolean notOptimize) {
        if (notOptimize) {
            if (input.length() == 0)
                return "";

            char firstChar = input.charAt(0);
            char replacedFirstChar = firstChar == 'x' || firstChar == 'X' ? '\0' : firstChar;
            String replaceRest = removeX(input.substring(1));

            return (replacedFirstChar + replaceRest).trim();
        } else {
            return removeX(input);
        }
    }
}
