package coding_ninjas.basic_of_java.methods;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120298/offering/1404436
 *
 * */

import java.util.Scanner;

public class PrintDivisorsOfaNumber {

    // Write your printDivisor function here
    private void printDivisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        PrintDivisorsOfaNumber obj = new PrintDivisorsOfaNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        obj.printDivisor(n);
    }
}
