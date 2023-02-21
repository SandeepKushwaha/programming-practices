package coding_ninjas.data_structures_in_java.oops.oops_part_one.constructors;

public class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
        System.out.println("Object created=" + this + " with values: rollNumber=" + this.rollNumber + ", name=" + this.name);
    }

    public Student() {
        System.out.println("Object created=" + this + " with values: rollNumber=" + this.rollNumber + ", name=" + this.name);
    }

    public Student(String name) {
        this.name = name;
        System.out.println("Object created=" + this + " with values: rollNumber=" + this.rollNumber + ", name=" + this.name);
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
