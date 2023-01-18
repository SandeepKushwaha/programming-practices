package coding_ninjas.introduction_to_java.arrays;

public class ArrayPassedInsideFunction {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("inside the main : " + arr);
        printArray(arr);
        incrementArr(arr);
        // printing the array
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        System.out.println("Inside the printArray : " + arr);
        System.out.print("Array Elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void incrementArr(int[] arr) {
        System.out.println("inside the incrementArr : " + arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }
}
