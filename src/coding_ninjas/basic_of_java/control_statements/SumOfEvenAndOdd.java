package coding_ninjas.basic_of_java.control_statements;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1459169
 *
 * */

public class SumOfEvenAndOdd {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        int even = 0, odd = 0;
        while (N > 0) {
            int digit = N % 10;
            N /= 10;

            if (digit % 2 == 0) even += digit;
            else odd += digit;
        }
        System.out.println(even + " " + odd);

    }
}
