package coding_ninjas.data_structures_in_java.oops.getters_setters;

public class Student {
    String name;
    private int rollNumber;

    public void setRollNumber(int rollNumber) {
        System.out.println("setRollNumber called. and `this` value: " + this);
        if (rollNumber <= 0) // validating the input for roll number.
            return;
        this.rollNumber = rollNumber; // this keyword refers the current object.
    }

    public int getRollNumber() {
        return this.rollNumber;
    }
}
