package coding_ninjas.introduction_to_java.time_complexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TripletSumInArray {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0)
            return input;

        String[] strNumbers;
        strNumbers = br.readLine().split("\\s");

        for (int i = 0; i < size; ++i)
            input[i] = Integer.parseInt(strNumbers[i]);

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr)
            System.out.print(element + " ");

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int[] arr = takeInput();
            int num = Integer.parseInt(br.readLine().trim());
            System.out.println(tripletSum(arr, num));
            System.out.println();
            System.out.println(tripletSumWithTimeComplexity(arr, num));
        }
    }

    private static int tripletSumWithTimeComplexity(int[] arr, int num) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length; j++)
                for (int k = j; k < arr.length; k++)
                    if (i != j && j != k && (arr[i] + arr[j] + arr[k] == num))
                        counter++;

        return counter;
        /* Time complexity O(n^2)
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < arr.length; j++) {
                int rem = num - arr[i] - arr[j];
                if (map.containsKey(rem)) {
                    count += map.get(rem);
                }
                if (!map.containsKey(arr[j])) {
                    map.put(arr[j], 1);
                } else {
                    map.put(arr[j], map.get(arr[j]) + 1);
                }
            }
        }
        return count;*/

        /* Another alternative code but having complexity O(n^2)
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1, k = arr.length - 1;
            while (j < k) {
                int curr_sum = arr[i] + arr[j] + arr[k];
                if (curr_sum == num) {
                    int left = 1, right = 1;
                    while (j + left < k && arr[j + left] == arr[j]) left++;
                    while (j < k - right && arr[k - right] == arr[k]) right++;
                    ans += left * right;
                    j += left;
                    k -= right;
                } else if (curr_sum < num) j += 1;
                else k -= 1;
            }
        }
        return ans;
        */
    }

    // Here is the Best Optimized Solution.
    public static int tripletSum(int[] arr, int num) {
        Arrays.sort(arr);
        int n = arr.length;

        int numTriplets = 0;

        for (int i = 0; i < n; i++) {
            int pairSum = num - arr[i];
            int numPairs = 0;

            int start = i + 1;
            int stop = n - 1;

            while (start < stop) {
                if (arr[start] + arr[stop] < pairSum)
                    start++;
                else if (arr[start] + arr[stop] > pairSum)
                    stop--;
                else {
                    if (arr[start] == arr[stop]) {
                        int totalCount = (stop - start) + 1;
                        numPairs += (totalCount * (totalCount - 1) / 2);
                        break;
                    }

                    int tempI = start + 1;
                    int tempJ = stop - 1;

                    while (tempI <= tempJ && arr[start] == arr[tempI])
                        tempI++;

                    while (tempI <= tempJ && arr[stop] == arr[tempJ])
                        tempJ--;

                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = stop - tempJ;

                    numPairs += (totalElementFromStart * totalElementFromEnd);

                    start = tempI;
                    stop = tempJ;
                }
            }
            numTriplets += numPairs;
        }
        return numTriplets;
    }

    /* Failing the Test case(s).
    public static int tripletSum(int[] arr, int num) {
        Arrays.sort(arr);
        int n = arr.length;

        int numTriplets = 0;

        for (int i = 0; i < n; i++) {
            int pairSumFor = num - arr[i];
            int numPairs = pairSum(arr, (i + 1), (n - 1), pairSumFor);

            numTriplets += numPairs;
        }
        return numTriplets;
    }

    public static int pairSum(int[] arr, int startIndex, int endIndex, int num) {
        int numPair = 0;

        while (startIndex < endIndex) {

            if (arr[startIndex] + arr[endIndex] < num) {
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > num) {
                endIndex--;
            } else {
                int elementAtStart = arr[startIndex];
                int elementAtEnd = arr[endIndex];

                if (elementAtStart == elementAtEnd) {
                    int totalElementFromStartToEnd = (endIndex - startIndex) + 1;
                    numPair += (totalElementFromStartToEnd * (totalElementFromStartToEnd - 1) / 2);

                    return numPair;
                }
                int tempStartIndex = startIndex + 1;
                int tempEndIndex = endIndex - 1;

                while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtEnd) {
                    tempStartIndex++;
                }
                while (tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) {
                    tempEndIndex--;
                }

                int totalElementFromStart = tempStartIndex - startIndex;
                int totalElementFromEnd = (endIndex - tempEndIndex);

                numPair += (totalElementFromStart * totalElementFromEnd);

                startIndex = tempStartIndex;
                endIndex = tempEndIndex;
            }
        }
        return numPair;
    }
    */
}
