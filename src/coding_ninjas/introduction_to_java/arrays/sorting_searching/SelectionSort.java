package coding_ninjas.introduction_to_java.arrays.sorting_searching;

public class SelectionSort {
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
            selectionSort(array);
            // print the array after sorting
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;
            int smallNumber = array[index];
            array[index] = array[i];
            array[i] = smallNumber;
        }
    }
}
