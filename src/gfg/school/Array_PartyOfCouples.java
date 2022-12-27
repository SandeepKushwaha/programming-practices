package gfg.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://practice.geeksforgeeks.org/problems/alone-in-couple5507/1">Alone in couple</a>
 */


//{ Driver Code Starts
public class Array_PartyOfCouples {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] input_line = read.readLine().trim().split("\\s+");
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);

            System.out.println(Array_PartyOfCouplesSolution.findSingle(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Array_PartyOfCouplesSolution {
    static int findSingle(int N, int[] arr) {

        // Case 1: checking current and next element until the last position is same or not in odd positions
        /*Arrays.sort(arr);
        for (int i = 0; i < N; i+=2) {
            if (i != N-1 && arr[i] != arr[i+1]) {
                return arr[i];
            }
        }
        return arr[N-1];*/

        // case 2: Using XOR (A^A = 0 , A^0 = A)
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer = answer ^ arr[i];
        }
        return answer;
    }
}