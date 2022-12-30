package gfg.school;

/*
 *
 * problem : https://practice.geeksforgeeks.org/problems/the-dice-problem2316/1
 *
 * */

import java.io.IOException;
import java.util.Scanner;

public class DiceOppositeSide {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            DiceOppositeSideSolution ob = new DiceOppositeSideSolution();
            int ans = ob.oppositeFaceOfDice(N);
            System.out.println(ans);
        }
    }
}

//User function Template for Java
class DiceOppositeSideSolution {
    /*static*/ int oppositeFaceOfDice(int N) {
        if (N > 0 && N < 7) {
            // Opposite side of Dice is 7 then the calculation will be opposite = 7 - n
            return 7 - N;

        }
        return -1;
    }
}
