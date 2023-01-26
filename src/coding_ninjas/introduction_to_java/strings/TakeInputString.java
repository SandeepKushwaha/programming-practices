package coding_ninjas.introduction_to_java.strings;

import java.util.Scanner;

public class TakeInputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String str = scanner.next();
        String str = scanner.nextLine();
        System.out.println(str + "\t" + str.length());
    }
}
