package coding_ninjas.basic_of_java.control_statements;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1461356
 *
 * */

import java.util.Scanner;

public class QuadrantOfCoordinatePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(
                ((a > 0 && b > 0)
                        ? "1st Quadrant"
                        : (a < 0 && b > 0)
                            ? "2nd Quadrant"
                            : (a < 0 && b < 0)
                                ? "3rd Quadrant"
                                : (a > 0 && b < 0)
                                    ? "4th Quadrant"
                                    : (a != 0 && b == 0)
                                        ? "x axis"
                                        : (a == 0 && b != 0)
                                            ? "y axis"
                                            : "Origin"));

        /* Using If-else-If statements
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("4th Quadrant");
        } else if (x > 0 || x < 0 && y == 0) {
            System.out.println("x axis");
        } else if (x == 0 && y > 0 || y < 0) {
            System.out.println("y axis");
        } else if (x == 0 && y == 0) {
            System.out.println("Origin");
        }
        */
    }
}
