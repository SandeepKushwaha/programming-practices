package coding_ninjas.data_structures_in_java.oops_part_one;

import java.util.Scanner;

public class Polynomial {
    int[] coefficient;

    public Polynomial() {
        this.coefficient = new int[100];
    }

    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term(with specified degree and value is added int the polynomial). If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coefficient) {
        this.coefficient[degree] += coefficient;
    }

    // Prints all the terms(only terms with non-zero coefficients are to be printed) in increasing order of degree.
    public void print() {
        for (int i = 0; i < coefficient.length; i++) {
            if (coefficient[i] != 0) {
                System.out.print(coefficient[i] + "x" + i + "\t");
            }
        }
        System.out.println();
    }

    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial polynomial) {
        for (int i = 0; i < this.coefficient.length; i++) {
            for (int j = 0; j < polynomial.coefficient.length; j++) {
                if (i == j && (this.coefficient[i] != 0 || polynomial.coefficient[j] != 0)) {
                    this.coefficient[i] += polynomial.coefficient[j];
                }
            }
        }
        return this;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial polynomial) {
        for (int i = 0; i < this.coefficient.length; i++) {
            for (int j = 0; j < polynomial.coefficient.length; j++) {
                if (i == j && (this.coefficient[i] != 0 || polynomial.coefficient[j] != 0)) {
                    this.coefficient[i] -= polynomial.coefficient[j];
                }
            }
        }
        return this;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial polynomial) {
        Polynomial object = new Polynomial();
        for (int i = 0; i < this.coefficient.length / 2; i++) {
            for (int j = 0; j < polynomial.coefficient.length / 2; j++) {
                object.coefficient[(i + j)] += this.coefficient[i] * polynomial.coefficient[j];
            }
        }
        return object;
    }
}

class PolynomialMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] degree1 = new int[n];
        for (int i = 0; i < n; i++)
            degree1[i] = s.nextInt();

        int[] coefficient1 = new int[n];
        for (int i = 0; i < n; i++)
            coefficient1[i] = s.nextInt();

        Polynomial first = new Polynomial();
        for (int i = 0; i < n; i++)
            first.setCoefficient(degree1[i], coefficient1[i]);

        n = s.nextInt();
        int[] degree2 = new int[n];
        for (int i = 0; i < n; i++)
            degree2[i] = s.nextInt();

        int[] coefficient2 = new int[n];
        for (int i = 0; i < n; i++)
            coefficient2[i] = s.nextInt();

        Polynomial second = new Polynomial();
        for (int i = 0; i < n; i++)
            second.setCoefficient(degree2[i], coefficient2[i]);

        int choice = s.nextInt();
        Polynomial result;
        switch (choice) {
            // Add
            case 1 -> {
                result = first.add(second);
                result.print();
            }
            // Subtract
            case 2 -> {
                result = first.subtract(second);
                result.print();
            }
            // Multiply
            case 3 -> {
                result = first.multiply(second);
                result.print();
            }
        }
    }
}

