package coding_ninjas.introduction_to_java.functions_and_scope;

public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
        // Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W),
        // you need to convert all Fahrenheit values from Start to End at the gap of W,
        // into their corresponding Celsius values and print the table.

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int step = sc.nextInt();
        FahrenheitToCelsiusTable.printFahrenheitTable(start, end, step);
    }

    public static void printFahrenheitTable(int start, int end, int step) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print the specified output in required format.
         * Taking input is handled automatically.
         */

        for (int i = start; i <= end; i += step) {
            System.out.println(i + "\t" + ((i - 32) * 5) / 9);
        }
    }
}
