package coding_ninjas.introduction_to_java.arrays.sorting_searching;

public class InsertionSort {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            // take input for array length
            int length = scanner.nextInt();
            int[] array = new int[length];

            // take input in array
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }
            insertionSort(array);
            // print the array after sorting
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
