package coding_ninjas.introduction_to_java.arrays.two_d_arrays;

public class SumOfElements2DArray {
    public static int sumOfElements(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }

    public static void doubleTheElement(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 2 * i + j;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 2, 4, 5}, {3, 4, 5, 6, 7}, {5, 6, 7, 8, 9}};
        System.out.println(sumOfElements(arr));
        System.out.println();

        int[][] doubleElementArr = new int[2][2];
        doubleTheElement(doubleElementArr);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(doubleElementArr[i][j] + " ");
            }
        }
    }
}
