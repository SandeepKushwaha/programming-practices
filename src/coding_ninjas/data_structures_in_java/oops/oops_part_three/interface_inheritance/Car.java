package coding_ninjas.data_structures_in_java.oops.oops_part_three.interface_inheritance;

public class Car extends Vehicle implements VehicleInterface, CarInterface{

    private final String companyName;

    public Car(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean isMotorized() {
        return true;
    }

    @Override
    public String getCompany() {
        return this.companyName;
    }

    @Override
    public int getNumberOfGears() {
        return 5;
    }
}
