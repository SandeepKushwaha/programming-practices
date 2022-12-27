package relevel.backend;

/*

Odd Subset
Question Name: Odd Subset

Problem Statement

Antonio got an array for his Christmas present. The array he got consists of N positive integers.

He was getting bored on Christmas Eve and decided to solve the below problem to overcome his boredom :

What’s the maximum length subset of the given array such that the sum of all elements of this subset is an odd number.
Antonio got stuck in the problem and has a party to attend at night. Hence you, being Antonio’s best friend decided to help him solve the problem.

Given array A, print the maximum possible length of the subset of this array such that the sum of all elements of this subset is an odd number. If there is no such subset print “-1”(without quotes) instead.

A subset of the array A as a tuple that can be obtained from A by removing some (possibly all) elements of it.

Input Format

First line contains a single integer denoting N.
Next line contains N space separated integers denoting the elements of array A.
Output Format

Print the maximum possible length of the subset of the given array such that the sum of all elements of this subset is an odd number
Constraints

1<=N<=105
1<=Ai<=109
Sample Input 1

4

4 2 3 1

Sample Output 1

3

Explanation of Sample 1

One can select the subset as [4 2 '3' 1]. The sum of all elements of this subset = 4+2+1 = 7 which is odd.

*/

/*

// Function candidate has to implement
function oddSubset(arr, n)
{

}


//Driver Code
var n = readline();
var temp = readline().trim();
var s = temp.split(" ");
for(i=0;i<n;i++)
{
    s[i]=Number(s[i]);
}
var num  = oddSubset(s,n);
print(num);

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Array_MaxLengthOfSubsetOddSum {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());

        String temp = reader.readLine().trim();
        String[] tempStr = temp.split(" ");
        int[] s = new int[tempStr.length];

        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(tempStr[i]);
        }

        int num = oddSubset(s, n);

        System.out.println(num);

    }

    private static void getSubsets(int index, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> answers, ArrayList<Integer> inputArrayList) {
        if (index == inputArrayList.size()) {
            if (temp.size() > 0) {
                answers.add(temp);
            }
            return;
        }
        ArrayList<Integer> temp1 = new ArrayList<>(temp);
        temp1.add(inputArrayList.get(index));
        getSubsets(index + 1, temp1, answers, inputArrayList);
        getSubsets(index + 1, temp, answers, inputArrayList);
    }

    private static int oddSubset(int[] s, int ignoredN) {

        ArrayList<Integer> inputArrayList = new ArrayList<>();
        ArrayList<Integer> finalAnswers = new ArrayList<>();
        ArrayList<Integer> finalAnswersLength = new ArrayList<>();
//        int result = 0;

        for (int item: s) {
            inputArrayList.add(item);
        }

        ArrayList<ArrayList<Integer>>  answer = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        getSubsets(0, temp, answer, inputArrayList);

        for (ArrayList<Integer> integers : answer) {
            Collections.sort(integers);

            int subsetSum = 0;

//            System.out.println(integers);

            if (integers.isEmpty()) {
                return -1;
            }
//            Integer maxOdd = integers.stream().filter(z -> z % 2 == 1).max(Integer::compare).orElse(0);

            for (Integer integer : integers) {
                if (integers.size() %2 != 0) {
                    subsetSum += integer;
                    finalAnswers.add(subsetSum);
                    finalAnswersLength.add(integers.size());
                }
            }
        }

//        System.out.println("--- final answers ---");
        System.out.println(finalAnswers);

        return Collections.max(finalAnswersLength);
    }
}

