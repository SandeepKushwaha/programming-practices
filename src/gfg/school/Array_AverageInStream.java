package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/average4856/1
 *
 * */

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Array_AverageInStream {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            float[] ans = new Array_AverageInStreamSolution().streamAvg(arr, n);
            for (int i = 0; i < n; i++) {
                DecimalFormat df = new DecimalFormat("#.##");
                String formatted1 = df.format(ans[i]);
                String formatted2 = String.format("%.2f", ans[i]);
                if (formatted1.length() >= 3 && formatted1.charAt(formatted1.length() - 3) == '.')
                    System.out.print(formatted1 + " ");
                else System.out.print(formatted2 + " ");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Array_AverageInStreamSolution {
    float[] streamAvg(int[] arr, int n) {
        float[] streams = new float[n];

        if (n >= 1 && n <= 100_000) {
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 1 && arr[i] <= 1_000_000) {
                    float avg;
                    int sum = 0;
                    for (int j = 0; j <= i; j++) {
                        sum += arr[j];
                    }
                    avg = (float) sum / (i + 1);
                    streams[i] = avg;
                }
            }
        }

        return streams;
    }
}

