package coding_ninjas.introduction_to_java.arrays.sorting_searching;

public class BubbleSort {
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
            bubbleSort(array);
            // print the array after sorting
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    private static void bubbleSort(int[] array) {
        if (array.length == 0 || array.length == 1)
            return;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}
