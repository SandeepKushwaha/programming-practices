package coding_ninjas.basic_of_java.BasicIO;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120300/offering/1459166
 *
 * */

import java.util.Scanner;

public class CalculateSimpleInterest {

    public static void main(String[] args) {

        // Write code here
        Scanner sc = new Scanner(System.in);
        int principalAmount = sc.nextInt();
        double interest = sc.nextDouble();
        int timePeriod = sc.nextInt();

        int simpleInterest = (int) (principalAmount * interest * timePeriod) / 100;

        System.out.println(simpleInterest);
    }
}
