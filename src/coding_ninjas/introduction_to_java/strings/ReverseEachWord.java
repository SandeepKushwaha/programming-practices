package coding_ninjas.introduction_to_java.strings;

import java.util.Scanner;

public class ReverseEachWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println("Original: " + s);
        System.out.println("Reverse: " + reverseEachWord(s));
    }

    private static String reverseEachWord(String s) {
        StringBuilder reverse = new StringBuilder();

        String[] strings = s.split("\\s");

        for (String str : strings) {
            StringBuilder stringBuffer = new StringBuilder(str);
            stringBuffer.reverse();
            reverse.append(stringBuffer).append(" ");
        }

        return reverse.toString();
    }
}
