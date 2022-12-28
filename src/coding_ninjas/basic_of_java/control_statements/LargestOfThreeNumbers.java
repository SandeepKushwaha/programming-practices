package coding_ninjas.basic_of_java.control_statements;

/*
*
* problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120302/offering/1461355
*
* */

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {

        // Write code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        /* Advance question solution with api
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int[] numbers = new int[inputs.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputs[i]);
        }

        System.out.println(Arrays.stream(numbers).max().getAsInt());*/

    }
}

