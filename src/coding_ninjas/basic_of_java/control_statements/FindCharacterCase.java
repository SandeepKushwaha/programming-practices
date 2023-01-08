package coding_ninjas.basic_of_java.control_statements;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1461353
 *
 * */

public class FindCharacterCase {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        String input = sc.next();
        char ch = input.charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println('1');
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println('0');
        } else {
            System.out.println("-1");
        }
    }
}
