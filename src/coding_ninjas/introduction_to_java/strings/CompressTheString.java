package coding_ninjas.introduction_to_java.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompressTheString {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) str = str.trim();
        else str = "";

        String ans = getCompressedString(str);

        System.out.println(ans);

    }

    private static String getCompressedString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(str.charAt(i));
            if (count > 1) result.append(count);
        }
        return result.toString();
    }
}
