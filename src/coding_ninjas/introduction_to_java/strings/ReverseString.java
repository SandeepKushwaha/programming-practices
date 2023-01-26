package coding_ninjas.introduction_to_java.strings;

import java.util.Scanner;

public class ReverseString {

    public static String reverse(String string) {
        StringBuilder reverse = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse.append(string.charAt(i));
        }
        return reverse.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println("original: "+ str + " and reverse: " + reverse(str));
    }
}
