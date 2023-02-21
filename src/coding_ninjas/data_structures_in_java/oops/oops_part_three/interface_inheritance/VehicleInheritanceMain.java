package coding_ninjas.data_structures_in_java.oops.oops_part_three.interface_inheritance;

public class VehicleInheritanceMain {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        VehicleInterface vehicleInterface;
        System.out.println(vehicle);

        Car car = new Car("BMW");
        System.out.println(car.getCompany());
        System.out.println(car.isMotorized());
        System.out.println(car.getNumberOfGears());
    }
}
