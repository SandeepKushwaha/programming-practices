package coding_ninjas.introduction_to_java.strings;

import java.util.Scanner;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(reverseWordWise(input));
    }

    public static String reverseWordWise(String input) {
        // Write your code here
        String[] words = input.split("\\s");
        StringBuilder reverseStringWordWise = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseStringWordWise.append(words[i]).append(" ");
        }

        return reverseStringWordWise.toString();
    }
}
