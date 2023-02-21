package coding_ninjas.data_structures_in_java.oops.oops_part_three.interface_intro;

public class Vehicle implements VehicleInterface {
    @Override
    public boolean isMotorized() {
        return false;
    }

    @Override
    public String getCompany() {
        return null;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Vehicle { isMotorized: " + isMotorized() +
            ", company: " + getCompany() + " }";
    }
}
