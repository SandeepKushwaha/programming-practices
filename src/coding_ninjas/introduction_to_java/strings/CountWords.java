package coding_ninjas.introduction_to_java.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWords {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String str = br.readLine();
        if (str != null) str = str.trim();
        else str = "";

        int count = countWords(str);
        System.out.println(count);
    }

    private static int countWords(String str) {
        if (str.length() == 0) return 0;
        return str.split(" ").length;
    }
}
