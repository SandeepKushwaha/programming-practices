package coding_ninjas.data_structures_in_java.tests.test4;

import java.util.Scanner;

public class MaximumProfitOnApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++)
            input[i] = s.nextInt();

        System.out.println(maximumProfit(input));
    }

    public static int maximumProfit(int[] budgets) {
        // Write your code here
        java.util.Arrays.sort(budgets);
        int maxProfit = Integer.MIN_VALUE;
        int n = budgets.length;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, budgets[i] * (n - i));
        }
        return maxProfit;
    }
}
