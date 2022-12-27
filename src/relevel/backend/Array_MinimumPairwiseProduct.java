package relevel.backend;

/*

Question Name: Minimum Pairwise Product

Problem Statement

Antonio and his girlfriend Teena decided to move their relationship to the next level and decided to buy arrays from a nearby arrays shop.

Each of them bought one array. Antonio bought array A consisting of N integers and Teena bought array B consisting of M integers.

Now Antonio and Teena are compatible with each other(that’s why they are in a relationship) and want their arrays to have maximum compatibility too.

Compatibility of two arrays A and B is measured as :

Two arrays are compatible if and only if they have an equal number of elements.
Compatibility value of arrays A and B each having length L = A1*B1 + A2*B2 + … + AL*BL.
To achieve this Antonio and Teena decided to remove some elements from each of their arrays such that arrays A and B have an equal number of elements and their compatibility value is as large as possible.

Given arrays A and B, print the maximum compatibility value it's possible to achieve by removing some elements from both the arrays(and making them of the same length).

Input Format

First line contains two space separated integers denoting N and M.
Next line contains N space separated integers denoting the elements of array A.
Next line contains M space separated integers denoting the elements of array B.
Output Format

Print the maximum compatibility value it's possible to achieve by removing some elements from both the arrays
Constraints

1<=N,M<=1000
-105<=Ai, Bi<=105
Sample Input 1

3 4

-1 2 1

-100 3 10 -9

Sample Output 1

120

Explanation of Sample 1

Erase the 3rd element of array A. Array A becomes = [-1, 2]

Erase the 2nd and 4th element of array A. Array A becomes = [-100, 10]

Compatibility values of these arrays = [(-1)*(-100) + 2*10] = 120.
'

*/

/*

// Function candidate has to implement
function minimumPairwiseProduct(a,b,n,m)
{

}


//Driver Code

var temp1 = readline().trim();
var temp2 = temp1.split(" ");
var n=Number(temp2[0]);
var m=Number(temp2[1]);
var temp = readline().trim();
var a = temp.split(" ");
for(i=0;i<n;i++)
{
    a[i]=Number(a[i]);
}

temp = readline().trim();
var b = temp.split(" ");
for(i=0;i<m;i++)
{
    b[i]=Number(b[i]);
}

var num  = minimumPairwiseProduct(a,b,n,m);
print(num);

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_MinimumPairwiseProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp1 = reader.readLine().trim();
        String[] temp2 = temp1.split(" ");
        int n = Integer.parseInt(temp2[0]);
        int m = Integer.parseInt(temp2[1]);

        String temp = reader.readLine().trim();
        String[] _a = temp.split(" ");

        Integer[] a = new Integer[_a.length];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(_a[i]);
        }

        temp = reader.readLine().trim();
        String[] _b = temp.split(" ");

        Integer[] b = new Integer[_b.length];
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(_b[i]);
        }

        Integer number = minimumPairwiseProduct(a, b, n, m);
        System.out.println(number);
    }

    public static int calcTwoArrayMultiplication(Integer[] a, Integer[] b) {
        int length = a.length;
        int result = 0;

        if (a.length == b.length) {
            for (int i = 0; i < length; i++) {
                result += a[i] * b[i];
            }
        }

        return result;
    }

    private static Integer minimumPairwiseProduct(Integer[] a, Integer[] b, Integer n, Integer m) {

        if (n > 0 && m > 0 && n <= 1000 && m <= 1000) {
            // do the
            if (Arrays.stream(a).anyMatch(integer -> integer<=105 && integer>=-105) && Arrays.stream(b).anyMatch(integer -> integer<=105 && integer>=-105) ) {
                if (n.equals(m)) {
                    // compare all numbers and calc ai*bi + ... + an*bn
                    return calcTwoArrayMultiplication(a, b);
                } else {
                    // code here to remove elements and find the maximum compatibility value it's possible to achieve by removing some elements from both the arrays
                    // compatible number(friendly number) : a number which is ends with 0 or 5

                    int result = 0;
                    // create new array with same length then call calcTwoArrayMultiplication(array1, array2) if necessary of calc instead

                    // check m or n which is less index according to them calc the result
                    for (int i = 0; i < n -1; i++) {
                        for (int j = 0; j < m; j++) {
                            int temp = a[i] * b[j];
                            if (temp % 5 == 0 && temp > 0) {
                                // calculation of final two array element for a1*b1 + a2*b2 + ... + an*bn
                                // System.out.println("temp = " + temp + " of " + a[i] + "*" + b[j]);
                                result += temp;
                            }
                        }
                    }
                    return result;
                }
            } else {
                throw new Error("Ai or Bi having value out of bound");
            }
        } else {
            throw new Error("n or m having value of out of bound");
        }
    }
}
