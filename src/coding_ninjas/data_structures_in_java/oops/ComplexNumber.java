package coding_ninjas.data_structures_in_java.oops;

public class ComplexNumber {
    int real, imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /* This commented part is the actual solution of the question.

    // as per question required method plus returns void
    public void plus(ComplexNumber c2) {
        this.real += c2.real;
        this.imaginary += c2.imaginary;
    }

    // as per question required method multiply returns void
    public void multiply(ComplexNumber c2) {
        int real = this.real * c2.real - this.imaginary * c2.imaginary;
        int imaginary = this.real * c2.imaginary + this.imaginary * c2.real;
        this.real = real;
        this.imaginary = imaginary;
    }

    // as per question for negative imaginary print not handled
    public void print() {
        System.out.println(real + " + i" + imaginary);
    }
    */

    public ComplexNumber plus(ComplexNumber cn) {
        int real = this.real + cn.real;
        int imaginary = this.imaginary + cn.imaginary;

        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber multiply(ComplexNumber cn) {
        int real = this.real * cn.real - this.imaginary * cn.imaginary;
        int imaginary = this.real * cn.imaginary + this.imaginary * cn.real;
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber minus(ComplexNumber cn) {
        int real = this.real - cn.real;
        int imaginary = this.imaginary - cn.imaginary;

        return new ComplexNumber(real, imaginary);
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String sign = imaginary >= 0 ? "+" : ""; // negative have no value because imaginary have already signed.
        return real + " " + sign + " " + imaginary + "i";
    }
}

class ComplexNumberMain {
    /* This is the ComplexNumber class calls as per question.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = s.nextInt();

        if(choice == 1)
            // Add
            c1.plus(c2);
        else if(choice == 2)
            // Multiply
            c1.multiply(c2);

        c1.print();
    }
    */
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(3, 6);
        ComplexNumber cn2 = new ComplexNumber(7, 9);

        ComplexNumber addition = cn1.plus(cn2);
        addition.print();

        ComplexNumber multiply = cn1.multiply(cn2);
        multiply.print();

        ComplexNumber minus = cn1.minus(cn2);
        minus.print();

    }
}
