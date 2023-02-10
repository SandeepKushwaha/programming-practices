package coding_ninjas.data_structures_in_java.oops_part_one.final_keyword;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(1001, "Hari");
        System.out.println(student.getRollNumber());
        System.out.println(student.getName());
        // student.conversionFactor = 0.90; // unable to change final variable
        student.cgpa = 8.9; // non-final variable can be change any time.
        System.out.println(student.cgpa);
        System.out.println(student.conversionFactor); // final variable is read only variable.
    }
}
