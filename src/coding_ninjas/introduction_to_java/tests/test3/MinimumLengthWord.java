package coding_ninjas.introduction_to_java.tests.test3;

import java.util.Scanner;

public class MinimumLengthWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(minLengthWord(str));
    }

    public static String minLengthWord(String input) {
        // Write your code here
        String[] words = input.split(" ");
        int minLength = Integer.MAX_VALUE;
        String minWord = "";
        for (String word : words) {
            if (word.length() < minLength) {
                minLength = word.length();
                minWord = word;
            }
        }
        return minWord;
    }
}
