package coding_ninjas.introduction_to_java.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveConsecutiveDuplicates {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main (String [] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) str = str.trim();
        else str = "";

        String ans = removeConsecutiveDuplicates(str);

        System.out.println(ans);

    }

    private static String removeConsecutiveDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if (temp != (int) str.charAt(i))
                result.append(str.charAt(i));

            temp = str.charAt(i);
        }

        return result.toString();
    }
}
