package coding_ninjas.basic_of_java.control_statements;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1461354
 *
 * */

import java.util.Scanner;

public class TotalSalary {

    public static void main(String[] args) {

        // Write code here
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        if (basic >= 0 && basic <= 7_500_000) {
            double hra = basic * 0.20;
            double da = basic * 0.50;
            double pf = basic * 0.11;
            int allow;
            char grade = sc.next().charAt(0);
            /* Java version less than 12
            switch (grade) {
                case 'A':
                    allow = 1700;
                    break;
                case 'B':
                    allow = 1500;
                    break;
                default:
                    allow = 1300;
            }
            */
            // Java SE 12+
            allow = switch (grade) {
                case 'A' -> 1700;
                case 'B' -> 1500;
                default -> 1300;
            };
            double totalSalary = basic + hra + da + allow - pf;
            System.out.println(Math.round(totalSalary));
        }

    }
}
