package coding_ninjas.data_structures_in_java.oops.oops_part_one.final_keyword;

public class Student {
    private int rollNumber;
    private String name;
    double cgpa;
    final double conversionFactor = 0.95; // final value can't be change after the initialization
    // NOTE: if instance level variable is private then it must be assigned/initialized the value on the
    //       time of object creation. i.e. variable must be assigned/initialized inside the constructor(s).

    public Student(int rollNumber, String name) {
        this.setRollNumber(rollNumber);
        this.setName(name);
        // conversionFactor = 0.98; // unable to change
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
