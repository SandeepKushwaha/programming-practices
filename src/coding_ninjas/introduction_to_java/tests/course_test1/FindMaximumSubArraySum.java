package coding_ninjas.introduction_to_java.tests.course_test1;

public class FindMaximumSubArraySum {
    public static void main(String[] args) {
        // Write your code here
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum, currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        maxSum = currentSum;
        for (int i = k; i < n; i++) {
            currentSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
        sc.close();
    }
}
