package coding_ninjas.data_structures_in_java.oops.oops_part_one;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            // throw an error, but we don't do that so simply set denominator = 1;
            // throw new RuntimeException("Denominator can't be zero.");
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++)
            if (numerator % i == 0 && denominator % i == 0)
                gcd = i;

        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void increment() {
        numerator = numerator + denominator;
        simplify();
    }

    public Fraction add(Fraction fraction) {
        int commonDenominator = this.getDenominator() * fraction.getDenominator();
        int commonNumerator = this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator();

        return new Fraction(commonNumerator, commonDenominator);
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int newNumerator = f1.getNumerator() * f2.getDenominator() + f2.getNumerator() * f1.getDenominator();
        int newDenominator = f1.getDenominator() * f2.getDenominator();

        return new Fraction(newNumerator, newDenominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            // throw error
            // throw new RuntimeException("Denominator can't be zero.");
            return;
        }
        this.denominator = denominator;
        simplify();
    }

    public void print() {
        if (numerator == denominator)
            System.out.println(numerator);
        else
            System.out.println(this);
    }

    @Override
    public String toString() {
        return this.getNumerator() + "/" + this.getDenominator();
    }
}

class FractionRunner {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(4, 6);
        fraction.print();
        fraction.increment();
        fraction.print();

        Fraction f1 = new Fraction(4, 6);
        Fraction f2 = new Fraction(3, 8);
        f2.setNumerator(2);
        Fraction sum = f1.add(f2);
        sum.print();

        Fraction f3 = new Fraction(4,8);
        f3.setDenominator(0); // denominator can't be zero that's why it won't be set as zero.
        Fraction staticAdd = Fraction.add(f1, f3);
        staticAdd.print();
    }
}
