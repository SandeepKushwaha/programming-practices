package gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Given an unsorted array, Arr[] of size N and that contains even number of occurrences for all numbers except two numbers.
// Find the two numbers in decreasing order which has odd occurrences.
//
//        Example 1:
//
//        Input:
//        N = 8
//        Arr = {4, 2, 4, 5, 2, 3, 3, 1}
//        Output: {5, 1}
//        Explanation: 5 and 1 have odd occurrences.
//
//
//        Example 2:
//
//        Input:
//        N = 8
//        Arr = {1 7 5 7 5 4 7 4}
//        Output: {7, 1}
//        Explanation: 7 and 1 have odd occurrences.

public class Array_TwoNumbersWithOddOccurrences {
    public static void main(String[] args)throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String[] input_line = read.readLine().trim().split("\\s+");
            int[] Arr = new int[N];

            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);

            Array_TwoNumbersWithOddOccurrencesSolution ob = new Array_TwoNumbersWithOddOccurrencesSolution();
            int[] ans = ob.twoOddNum(Arr,N);

/*//            for(int i = 0; i < ans.length; i++) {
//                System.out.print(ans[i] + " ");
//            }*/
            for(int an : ans) {
                System.out.print(an + " ");
            }
            System.out.println();
        }
    }
}

class Array_TwoNumbersWithOddOccurrencesSolution
{
    public int[] twoOddNum(int[] Arr, int N) {
        // temp arraylist to find all the odd position elements
        /*/ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 0; i < Arr.length; i++) {
            if (i == 0)
                ints.add(Arr[i]);
            if (i%2 != 0 && Arr[i]%2 != 0 && !ints.contains(Arr[i])) {
                ints.add(Arr[i]);
            }
        }
        // debug 1: printing ints before the sorting
        System.out.println("before::" + ints);
        int[] result = new int[2]; // returning array

        // evaluating descending order of Arraylist and then assign first two in the Array 'result'

        ints.sort(Collections.reverseOrder());
        // debug 2: printing ints after the sorting
        System.out.println("after::" + ints);

        for (int i = 0; i < ints.size(); i++) {
            if (i > 1) {
                break;
            }
//            if (ints.get(i)%2 != 0) {
                result[i] = ints.get(i);
//            }
        }

        return result;*/
        Arrays.sort(Arr);
        int [] ans = new int[2]; //temp=1: odd occurrence//temp=0: even occurrence
        int temp=1;
        int j=0;
        for(int i=N-1; i>0; i--){
            if(Arr[i]!=Arr[i-1]){
                if(temp==0)
                    temp=1;
                else
                    ans[j++] = Arr[i];
            }
            else{
                temp = (temp+1)%2;      //changing temp value between 1 and 0
            }
        }

        if(temp==1){
            ans[j] = Arr[0];

        }
        return ans;
    }
}

/*
 *
 *      public int[] twoOddNum(int[] Arr, int N) {
 * 	        HashSet<Integer> list = new HashSet<>();
 *         int[] answer = new int[2];
 *
 *         for (int i = 0; i < N; i++) {
 *             if (list.contains(Arr[i])) {
 *                 list.remove(Arr[i]);
 *             } else {
 *                 list.add(Arr[i]);
 *             }
 *         }
 *
 *         ArrayList<Integer> arrayList = new ArrayList<>(list);
 *         Collections.sort(arrayList);
 *
 *         for (int i = 0; i < arrayList.size(); i++) {
 *             answer[i] = arrayList.get(arrayList.size() - 1 - i);
 *         }
 *
 * 	       return answer;
 *      }
 *
 *
 *      --------------------------------------------
 *
 *      public int[] twoOddNum(int arr[], int n){
 *         int num =0;
 *
 *         HashMap<Integer, Integer> map = new HashMap<>();
 *
 *         for(int i=0;i<n;i++){
 *             map.put(arr[i], map.getOrDefault(arr[i],0)+1);
 *        }
 *        Set<Integer> set = map.keySet();
 *        ArrayList<Integer> list = new ArrayList<>();
 *        for(int i: set){
 *             if(map.get(i)%2 != 0){
 *                 list.add(i);
 *                 if(list.size()==2){
 *                     break;
 *                 }
 *             }
 *        }
 *        Collections.sort(list,Collections.reverseOrder());
 *        return list.stream().mapToInt(i->i).toArray();
 *     }
 *
 * */