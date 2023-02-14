package coding_ninjas.data_structures_in_java.oops_part_two.final_keyword;

public class Student {
    public String name;
    private final int rollNumber;
    double cgpa;
    final double conversionFactor = 0.95;

    /* rollNumber must be different for every Student
    public Student() {
        System.out.println("Student Object create.");
    }

    public Student(String name) {
        this.name = name;
    }
    */

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        // this.conversionFactor = 0.9; // final variable can't be updated again.
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + this.getRollNumber() +
                ", cgpa=" + cgpa +
                ", conversionFactor=" + conversionFactor +
                '}';
    }
}
