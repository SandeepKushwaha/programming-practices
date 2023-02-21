package coding_ninjas.data_structures_in_java.oops.oops_part_one.constructors;

public class StudentMain {

    public static void main(String[] args) {
        Student student = new Student(230001, "Ravi Kumar");
        System.out.println(student);
        System.out.println(student.getRollNumber());
        System.out.println(student.getName());
        System.out.println();

        student.setRollNumber(230010);
        student.setName("Anu Sharma");

        System.out.println(student.getRollNumber());
        System.out.println(student.getName());
        System.out.println();

        Student student1 = new Student();
        System.out.println(student1);
        System.out.println();

        Student student2 = new Student("Ram");
        System.out.println(student2);
        System.out.println(student2.getRollNumber());
        System.out.println(student2.getName());
    }
}
