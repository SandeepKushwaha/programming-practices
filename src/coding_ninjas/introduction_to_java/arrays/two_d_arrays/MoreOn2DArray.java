package coding_ninjas.introduction_to_java.arrays.two_d_arrays;

// import java.util.Arrays;

public class MoreOn2DArray {
    public static void main(String[] args) {
        int[][] ints = new int[4][]; // Following assignment process of Jagged Array

        for (int i = 0; i < ints.length; i++) {
            // System.out.println(Arrays.toString(ints[i]));
            ints[i] = new int[i+1];

            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = j+1;
            }
        }

        // Printing Jagged Array
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
