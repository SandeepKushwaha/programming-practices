package coding_ninjas.basic_of_java.control_statements;

/*
*
* problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1459168
*
* */

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();

        for (int i = s; i <= e; i+=w) {
            System.out.println(i + "\t" + ((i-32) * 5) / 9 );
        }
    }
}
