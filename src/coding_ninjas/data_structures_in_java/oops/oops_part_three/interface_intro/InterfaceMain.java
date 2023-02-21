package coding_ninjas.data_structures_in_java.oops.oops_part_three.interface_intro;

public class InterfaceMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.print();
        System.out.println();

        // VehicleInterface vInterface = new VehicleInterface(); // can't call the interface constructor.
        // Assigning class object in interface variable by using the polymorphism
        VehicleInterface vehicleInterface = new Vehicle();
        // vehicleInterface.print(); // can't accessible because of method not found in VehicleInterface.
        System.out.println(vehicleInterface);
    }
}
