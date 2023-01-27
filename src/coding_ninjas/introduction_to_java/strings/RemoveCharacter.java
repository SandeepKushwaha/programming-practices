package coding_ninjas.introduction_to_java.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveCharacter {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) str = str.trim();
        else str = "";

        char x = br.readLine().charAt(0);

        String ans = removeAllOccurrencesOfChar(str, x);

        System.out.println(ans);

    }

    private static String removeAllOccurrencesOfChar(String str, char x) {
        // Getting the Right result but getting the wrong answer in test cases.
        // return str.replace(x, '\0');
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) != x) stringBuilder.append(str.charAt(i));

        return stringBuilder.toString();
    }
}
