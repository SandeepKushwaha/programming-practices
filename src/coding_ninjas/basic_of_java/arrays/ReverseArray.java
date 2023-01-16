package coding_ninjas.basic_of_java.arrays;

/*
 *
 * problem : https://www.codingninjas.com/codestudio/guided-paths/basics-of-java/content/120299/offering/1459176
 *
 * */

import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int testCases = scanner.nextInt();

        if (testCases >= 1 && testCases <= 10)
            while (testCases-- > 0) {
                int number = scanner.nextInt();
                ArrayList<Integer> arrayList = new ArrayList<>();
                int m = scanner.nextInt();

                for (int i = 0; i < number; i++) {
                    arrayList.add(scanner.nextInt());
                }

                reverseArray(arrayList, m);
            }
    }

    public static void reverseArray(ArrayList<Integer> arr, int m) {
        // Write your code here.
        for (int i = m + 1, j = arr.size() - 1; i < j; i++, j--) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }
    }
}
