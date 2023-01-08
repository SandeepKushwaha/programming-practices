package coding_ninjas.basic_of_java.control_statements;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1459172
 *
 * */

public class FactorialOfANumber {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int number = sc.nextInt();

        if (number >= -10 && number <= 12) {
            if (number < 0) {
                System.out.println("Error");
            } else if (number == 0) {
                System.out.println("1");
            } else {
                int factorial = 1;
                for (int i = number; i >= 1; i--) {
                    factorial *= i;
                }
                System.out.println(factorial);
            }
        }

    }
}
