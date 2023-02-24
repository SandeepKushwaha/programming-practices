package coding_ninjas.data_structures_in_java.oops.oops_part_three.generics_method_bound;

public class Vehicle implements PrintInterface {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
