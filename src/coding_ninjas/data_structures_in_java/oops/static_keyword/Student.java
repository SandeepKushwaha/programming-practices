package coding_ninjas.data_structures_in_java.oops.static_keyword;

public class Student {
    private int rollNumber;
    private String name;
    final static double CONVERSION_FACTOR = 0.95;
    // if any variable is final and static then it considered as constant in java
    // and that variable name must be All Capital letters separated by Underscore.
    private static int numberOfStudents; // static variable is shared to every object of the class.
    // by marking private numberOfStudents no one can change the value outside the class

    public Student(int rollNumber, String name) {
        // in a non-static context static and non-static field(s) or method(s) is/are accessible.
        this.setRollNumber(rollNumber);
        this.setName(name);
        numberOfStudents++;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    public String getName() {
        return this.name;
    }

    public static int getNumberOfStudents() {
        // in a static context non-static field(s) or method(s) is/are inaccessible.
        return numberOfStudents;
    }
}
