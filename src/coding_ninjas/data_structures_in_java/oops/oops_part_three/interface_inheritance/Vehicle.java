package coding_ninjas.data_structures_in_java.oops.oops_part_three.interface_inheritance;

public class Vehicle {
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Vehicle { }";
    }
}
