package coding_ninjas.introduction_to_java.operators_and_for_loop;

public class OperatorsExercises {

    // Practice Exercise examples
    public static void main(String[] args) {
        // E1
        int a = 42;
        int b = ~a; // there is tilde sign before a
        System.out.println(a + " " + b);
        System.out.println();

        // E2
        int x, y = 1;
        x = 10;
        if (x != 10 && x/0 == 0) { // false && true/false(never evaluated)
            System.out.println(y);
        } else {
            System.out.println(++y);
        }
        System.out.println();

        // E3
        int p = 15;
        int q = p++;
        int r = ++p;
        System.out.println(q + " " + r);
        System.out.println();

        // E4
        int g = 3;
        System.out.println(++g * 8);
        System.out.println();

        // E5
        int xx = 10;
        int yy = 20;
        if(xx++ > 10 && ++yy > 20 )
            System.out.print("Inside if ");
        else
            System.out.print("Inside else ");
        System.out.println(xx + " " + yy);

        // E6
        int aa = 10;
        aa ^= 1;
        System.out.println(aa);

        // E7
        int m = 5;
        m += 5+(++m)+(m++); // 5+5+6+6 =22
        System.out.print(m);

        // E8
        int s = 10;
        s += ++s * 6;
        System.out.println(s);

        // E9
        int in = 5;
        int de = in++;
        int n = 50 / 2 * --in + in - de++ * 2 * 10 / 5;
        System.out.println("n is " + n);

        // E10
        int k=10;
        k+=++k-5/3+6*k;
        System.out.println(k);

        // E11
        int num = 5;
        for (int i = 1, j = 100; i <= num && j <= 500; i++, j += 200) {
            System.out.println(i + "\t" + j);
        }

        // E12
        for (int i = 1; i < 10; i *= 2) {
            System.out.println(i);
        }

        // E13
        // Put i = 1000, then 729, 386, 483
        for (int i = 483; i > 0; i%=3) {
            System.out.print("*");
        }
        System.out.println();

        // E14
        /* infinite loop
        for(int i = 7; i != 0; i--) {
            System.out.print(i--);
        }
        System.out.println();
        */

        // E15
        for (int i = 0; i <= 5; i++) {
            if (i == 4)
                break;
            System.out.print(i + " ");
        }
        System.out.println();

        // E16
        for (int i = 0; i <= 5; i++) {
            if (i == 3)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
