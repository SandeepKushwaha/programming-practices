package coding_ninjas.data_structures_in_java.oops.oops_part_one.static_keyword;

public class StudentMain {
    public static void main(String[] args) {
        // calling static variable before created any object
        // System.out.println(Student.numberOfStudents); // not accessible because of numberOfStudent is private.
        Student student = new Student(1001, "John");
        Student student1 = new Student(1002, "Mike");
        Student student2 = new Student(1003, "Luca");
        Student student3 = new Student(1004, "Lucy");

        System.out.println(student.getRollNumber() + " " + student.getName());
        // System.out.println(student.numberOfStudents); // non-static variable copy created while object created.
        System.out.println(student.getNumberOfStudents());
        // NOTE: non-static method accessible by object. but if it is static then it give a warning.
        System.out.println(student1.getRollNumber() + " " + student1.getName());
        System.out.println(student2.getRollNumber() + " " + student2.getName());
        System.out.println(student3.getRollNumber() + " " + student3.getName());

        // static variable can called by <ClassName>.field/method or <instance>.field/method
        System.out.println(Student.getNumberOfStudents());

        // accessing the constant in java.
        System.out.println(Student.CONVERSION_FACTOR);

    }
}
