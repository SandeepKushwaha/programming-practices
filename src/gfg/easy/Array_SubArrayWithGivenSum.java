package gfg.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;


/*
 * Problem : https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
 *
 * */
public class Array_SubArrayWithGivenSum {
    static BufferedReader br;
    static PrintWriter ot;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            String[] s = br.readLine().trim().split(" ");

            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int[] a = new int[n];
            s = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Array_SubArrayWithGivenSumSolution obj = new Array_SubArrayWithGivenSumSolution();
            ArrayList<Integer> res = obj.subArraySum(a, n, k);

//            for (int ii = 0; ii < res.size(); ii++)
//                ot.print(res.get(ii) + " ");
            for (Integer re : res) ot.print(re + " ");

            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Array_SubArrayWithGivenSumSolution {
    //Function to find a continuous sub-array which adds up to a given number.
    /*static*/ ArrayList<Integer> subArraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();

        int start = 0;
        int sum = 0;

        if (s > 0) {
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                while (sum > s) {
                    sum -= arr[start];
                    start++;
                }
                if (sum == s) {
                    ans.add(start + 1);
                    ans.add(i + 1);
                    return ans;
                }
            }
        }
        ans.add(-1);
        return ans;
    }
}


