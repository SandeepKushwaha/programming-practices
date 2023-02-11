package coding_ninjas.data_structures_in_java.oops_part_two.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        // vehicle.color = "Blue"; // private variable
        vehicle.setColor("Blue");
        vehicle.maxSpeed = 240;
        vehicle.print();

        Car car = new Car();
        car.setColor("Black");
        car.maxSpeed = 220;
        car.numberOfDoors = 4;
        car.print();

        Bicycle bicycle = new Bicycle();
        bicycle.setColor("Red");
        bicycle.maxSpeed = 12;
        bicycle.print();
    }
}
