package coding_ninjas.data_structures_in_java.oops.oops_part_three.generics_methods;

public class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + this.getName() + '\'' +
                '}';
    }
}
