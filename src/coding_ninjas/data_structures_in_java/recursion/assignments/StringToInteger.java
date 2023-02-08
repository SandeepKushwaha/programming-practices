package coding_ninjas.data_structures_in_java.recursion.assignments;

import java.util.Scanner;

public class StringToInteger {

    public static int convertStringToInt(String input) {
        // Write your code here
        if (input.length() == 1)
            return input.charAt(0) - '0';

        return (convertStringToInt(input.substring(0, input.length() - 1)) * 10)
                + input.charAt(input.length() - 1) - '0';
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(convertStringToInt(input));
    }
}
