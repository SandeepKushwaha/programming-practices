package coding_ninjas.data_structures_in_java.oops.oops_part_three.generics_method_bound;

public class GenericMethodBoundMain {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = new Vehicle("Vehicle " + i);
        }
        Print.printArray(vehicles);
        System.out.println();

        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i * 10 + 1, "Student " + i);
        }
        Print.printArray(students);
    }
}
