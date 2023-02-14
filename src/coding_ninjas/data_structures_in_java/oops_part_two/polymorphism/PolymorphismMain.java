package coding_ninjas.data_structures_in_java.oops_part_two.polymorphism;

import java.util.Scanner;

public class PolymorphismMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Car("Sky Blue", 120, 2);
        vehicle.setColor("Black");
        // vehicle.numberOfDoors = 4;
        vehicle.print();// method call decided on the runtime

        // Car car = new Vehicle(); // Vehicle is parent that can't be initialized in child that needs type-cast.

        Vehicle v;
        int n = new Scanner(System.in).nextInt();
        if (n < 10)
            v = new Car();
        else
            v = new Vehicle();

        v.print();
    }
}
