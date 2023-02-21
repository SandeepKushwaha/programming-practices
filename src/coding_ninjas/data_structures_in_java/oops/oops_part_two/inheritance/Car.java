package coding_ninjas.data_structures_in_java.oops.oops_part_two.inheritance;

public class Car extends Vehicle{
    int numberOfDoors;

    // Overriding the method which is originally defined inside the Parent class 'Vehicle'.
    @Override
    public void print() {
        String temp = super.toString() + "\b, numberOfDoors = " + numberOfDoors + '}';
        System.out.println(temp);
    }
}
