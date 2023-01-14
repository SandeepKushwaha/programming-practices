package coding_ninjas.introduction_to_java.operators_and_for_loop;

public class NthFibonacciNumber {

    // for Fibonacci Number Series
    static int fibonacci(int number) {
        if (number <= 1)
            return number;

        return fibonacci(number - 1)  + fibonacci(number - 2);
    }

    public static void main(String[] args) {

        // Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
        //         F(n) = F(n-1) + F(n-2),
        //         Where, F(1) =  1,
        //         F(2) = 1
        // Provided N you have to find out the Nth Fibonacci Number.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0 && number <= 10_000) {
            System.out.println(fibonacci(number));
        }
    }
}
