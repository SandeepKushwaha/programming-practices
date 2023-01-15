package coding_ninjas.introduction_to_java.operators_and_for_loop;

public class CheckNumberSequence {
    public static void main(String[] args) {
        // You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn.
        // Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n)
        // in such a way that the first part is strictly decreasing while the second is strictly increasing one.
        //
        // Note :   We say that x is strictly larger than y when x > y.
        //          So, a strictly increasing sequence can be 1 4 8.
        //          However, 1 4 4 is NOT a strictly increasing sequence.
        //
        // That is, in the sequence if numbers are decreasing, they can start increasing at one point.
        // Thereafter, they cannot decrease at any point further.
        // Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence.
        // So, in both the cases, print true.
        //
        //You just need to print true/false. No need to split the sequence.

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();

        int[] items = new int[number];

        for (int i = 0; i < items.length; i++) {
            items[i] = scanner.nextInt();
        }

        /* All the test cases pass but result is 66%
        boolean isSequence = true;
        for (int i = 0; i < number - 1; i++) {
            if (items[i] == items[i + 1]) {
                isSequence = false;
                break;
            } else if (items[i] < items[i + 1])
                isSequence = true;
            else if (items[i] > items[i + 1])
                isSequence = false;
        }
        if (isSequence) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }*/

        // one test case is fail but all the submission cases are passed.
        int i, f = 0;
        for (i = 0; i < number - 1; i++) {
            if (items[i] < items[i + 1]) {
                break;
            }
        }
        for (int j = i + 1; j < number - 1; j++) {
            if (items[j] > items[j + 1]) {
                f = 1;
                break;
            }
        }
        if (f == 1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
