package coding_ninjas.introduction_to_java.operators_and_for_loop;

public class BitwiseOperators {
    public static void main(String[] args) {
        int x = 2, y = 10;
        System.out.println(x & y); // calculation of AND addition operation x and y in binary representation
        System.out.println(x | y); // calculation of OR addition operation x and y in binary representation
        System.out.println(x ^ y); // calculation of XOR addition operation of x and y in binary representation
        System.out.println(~x); // once compliment of x

        System.out.println();

        /* Calculate and guess the output
        int a = 10, b = 20;
        int c = a & b;
        System.out.println(c);
        int d = a | b;
        System.out.println(d);
        int e = a ^ b;
        System.out.println(e);
        int f = c + d + e;
        System.out.println(~f);
        System.out.println(~a);

        System.out.println(10 ^ -20);

        System.out.println();
        */

        // left shift --> doubling the value
        System.out.println(x << 1); // left shift 1 bit
        System.out.println(x << 2); // left shift 2 bit
        System.out.println(x << 3); // left shift 3 bit
        System.out.println(x << 4); // left shift 5 bit
        System.out.println(1073741823 << 1); // Max int for one shift bit become still positive
        System.out.println(2004567200 << 1); // in this case is shift bit become negative number
        System.out.println();

        // right shift --> (half the value mostly)
        x = 64;
        System.out.println(x >> 1);
        System.out.println(x >> 2);
        System.out.println(x >> 3);
        System.out.println(x >> 4);
        System.out.println();
        System.out.println(-512 >> 1);
        System.out.println(-512 >> 2);
        System.out.println(-512 >> 3);
        System.out.println(-512 >> 4);
        System.out.println(-512 >> 8);
        System.out.println(-512 >> 9);
        System.out.println(-512 >> 10);
        System.out.println(2147483647 >> 1);
        System.out.println();
        System.out.println(-x >> -1);
        System.out.println(-1000 >> -1);
        System.out.println();
        System.out.println(10 >> 1);
        System.out.println(10 >> 2); // int part only


        System.out.println();

        // unsigned right shift
        System.out.println(x >>> 1);
        System.out.println(x >>> 2);
        System.out.println(-2147483648 >>> 1);
        System.out.println();
    }
}
