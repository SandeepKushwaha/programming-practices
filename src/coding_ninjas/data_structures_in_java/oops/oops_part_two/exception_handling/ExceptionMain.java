package coding_ninjas.data_structures_in_java.oops.oops_part_two.exception_handling;

public class ExceptionMain {
    public static void main(String[] args) /*throws MyDivideByZeroException*/ {
        // Null Pointer Exception
        // String name = null; // name having null value
        // System.out.println(name.length()); // try to perform operation on null

        // Divide By Zero Exception
        // System.out.println(4 / 0);
        // System.out.println("stmt"); // stmt not be executed. because of 4/0 give DivideByZeroException

        // Here is the Exception encountered
        int value = 0;
        try {
            value = divide(10 , 0);
            System.out.println(factorial(1));
            System.out.println("try it");
        } catch (MyDivideByZeroException e) {
            System.out.println("Divide by Zero exception is raised.");
        } catch (NegativeNumberException e) {
            System.out.println("Factorial: Negative Number Exception is raised.");
        } catch (Exception e) {
            System.out.println("Generic Exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Main: " +value);
    }

    public static int divide(int n, int d) throws MyDivideByZeroException{
        if (d == 0)
            throw new MyDivideByZeroException();

        return n / d;
    }

    public static int factorial(int number) throws NegativeNumberException {
        if (number < 0)
            throw new NegativeNumberException();
        int ans = 1;
        for (int i = 2; i <= number; i++) {
            ans *= i;
        }
        return ans;
    }
}
