package coding_ninjas.introduction_to_java.strings;

import java.util.Scanner;

public class PrintChars {

    public static void printChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printChars(scanner.nextLine());
    }
}
