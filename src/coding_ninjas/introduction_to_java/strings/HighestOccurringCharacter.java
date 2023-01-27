package coding_ninjas.introduction_to_java.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighestOccurringCharacter {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) str = str.trim();
        else str = "";

        char ans = highestOccurringChar(str);

        System.out.println(ans);

    }

    private static char highestOccurringChar(String str) {
        /* Time complexity O(n^2)
        char[] chars = str.toCharArray();
        int max = 0;
        char result = '\0';
        for (char c : chars) {
            int count = 0;
            for (char aChar : chars) {
                if (c == aChar)
                    count++;
            }
            if (max <= count) {
                max = count;
                result = c;
            }
        }

        return result;
        */

        // Time Complexity O(n)
        int[] count = new int[128];
        int max = 0;
        char result = '\0';
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            if (max <= count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
}
