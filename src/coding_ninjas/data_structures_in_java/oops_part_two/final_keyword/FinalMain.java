package coding_ninjas.data_structures_in_java.oops_part_two.final_keyword;

public class FinalMain {
    public static void main(String[] args) {
        // Creating Object of Student
        // Student student = new Student(); Created Object with default constructor.
        // student.conversionFactor = 0.85; // can't change final value from anywhere

        Student student = new Student("John", 100203);
        student.print();
    }
}
