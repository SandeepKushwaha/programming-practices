package coding_ninjas.data_structures_in_java.recursion.assignments;

import java.util.Scanner;

public class CheckAB {
    public static boolean checkAB(String input) {
        // Write your code here
        if (input.length() == 0)
            return true;
        else if (input.length() == 1)
            return input.charAt(0) == 'a';
        else if (input.charAt(0) != 'a')
            return false;
        else if (input.startsWith("abb")) // (input.length() >= 3 && input.substring(0, 3).equals("abb"))
            return checkAB(input.substring(3));
        else
            return checkAB(input.substring(1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println(checkAB(input));
    }
}
