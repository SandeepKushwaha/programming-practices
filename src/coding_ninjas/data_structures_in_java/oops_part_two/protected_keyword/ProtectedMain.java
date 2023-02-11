package coding_ninjas.data_structures_in_java.oops_part_two.protected_keyword;

import coding_ninjas.data_structures_in_java.oops_part_two.protected_keyword.different_package.PickUpTruck;
import coding_ninjas.data_structures_in_java.oops_part_two.protected_keyword.different_package.Vehicle;

public class ProtectedMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        // vehicle.maxSpeed = 150; // maxSpeed is protected so only accessible inside the same file/package or child class
        vehicle.setColor("White and Shine Black");
        vehicle.print();
        System.out.println();

        PickUpTruck pickUpTruck = new PickUpTruck();
        pickUpTruck.setName("Mahindra");
        pickUpTruck.setLoadingCapacity(200);
        pickUpTruck.setPersonCapacity(4);
        pickUpTruck.print();
        System.out.println();

        Truck truck = new Truck();
        truck.setColor("Dark Gray and Pink");
        truck.setMaxSpeed(140); // setter and getter of maxSpeed inside the Truck class
        truck.maxLoadCapacity = 650;
        truck.print();
    }
}
