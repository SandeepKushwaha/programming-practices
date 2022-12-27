package relevel.backend;///* package whatever; // don't place package name! */
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
///* Name of the class has to be "Main" only if the class is public. */
//class Main
//{
//    static Scanner scan = new Scanner(System.in);
//
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        // my code goes here
//        someElements();
//    }
//
//    public static void someElements() {
//        // input length for array
//        Integer n;
//        Integer input = scan.nextInt(); // a single integer denoting N.
//        if (input > 0) {
//            input = scan.nextInt();
//        }
//        n = input;
//        Integer[] p = new Integer[n];
//        Integer[] q = new Integer[n];
//
//        // input the array
//        p = inputArrayData(p);
//        // while inputting the q check the element of p can't contain in the q
//        q = inputArrayData(q);
//        // checking both array are equals or not
//        Integer countPr = -1;
//
//
//        Integer[] op = new Integer[p.length + q.length];
//
//        // copy array p,q in the op array
//        System.arraycopy(p, 0, op, 0, p.length);
//        System.arraycopy(q, 0, op, p.length, q.length);
//
//        Integer[] t = (Integer[]) Arrays.stream(op).sorted().toArray();
//        Collections.reverse(Arrays.asList(t));
//        for (int i = 0; i < op.length; i++) {
//            int count = 0;
//            if (t[i] == p[i] && t[i+1] == q[i+1]) {
//                count++;
//            }
//            countPr = count;
//        }
//
//        System.out.println(countPr);
//
//    }
//
//    public static Integer[] inputArrayData(Integer[] arr) {
//        Integer[] temp = new Integer[arr.length];
//        for(int i = 0; i < arr.length; i++) {
//            Integer data = scan.nextInt();
//            // check the data is already exist or not in the array
//            if (data > 0 && Arrays.stream(temp).allMatch(data::equals)) {
//                temp[i] = data;
//            }
//        }
//
//        return temp;
//    }
//}



/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
public class MaxLengthSubArray {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scan = new Scanner(System.in);

        String[] a = scan.nextLine().split(" ");

        int n = Integer.parseInt(a[0]);
//        int k = Integer.parseInt(a[1]);

        String[] arrStr = scan.nextLine().split(" ");

        int[] intStr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            intStr[i] = Integer.parseInt(arrStr[i]);
        }

        System.out.println(maxLenSub(intStr, n));

    }

    public static int maxLenSub(int[] arr, int n) {
        int[] m = new int[n];
        int max = 0;
        for (int i = 0; i<n; i++) {
            m[i] = 1;
        }
        for(int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(arr[i]- arr[j]) <= 1 && m[i] < m[j] + 1) {
                    m[i] = m[j] +1;
                }
            }
        }
        for (int i = 0; i<n; i++) {
            if (max < m[i]) {
                max = m[i];
            }
        }
        return max;
    }
}
